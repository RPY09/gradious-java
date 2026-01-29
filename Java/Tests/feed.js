const API_URL = "https://68f52de3b16eb6f4683691ee.mockapi.io/api/v1/feedback";

document.addEventListener("DOMContentLoaded", () => {
  fetchFeedback();

  // Listeners for main page actions
  document.querySelector(".addButton").addEventListener("click", openAddModal);
  document
    .getElementById("feedback-data")
    .addEventListener("click", handleTableActions);

  // Listeners for Add Modal buttons
  document
    .querySelector("#addUserModal .saveButton")
    .addEventListener("click", saveNewFeedback);
  document
    .querySelector("#addUserModal .closeButton")
    .addEventListener("click", closeAddModal);

  // Listeners for Delete Modal buttons (IDs are required: #delete, #cancel)
  document.getElementById("delete").addEventListener("click", performDelete);
  document.getElementById("cancel").addEventListener("click", closeDeleteModal);
});

// --- R (Read) ---
function fetchFeedback() {
  const http = new XMLHttpRequest();
  http.onreadystatechange = function () {
    if (this.readyState === 4) {
      if (this.status === 200) {
        const data = JSON.parse(this.responseText);
        renderFeedbackTable(data);
      } else {
        console.error("Error fetching data:", this.statusText);
        document.getElementById(
          "feedback-data"
        ).innerHTML = `<tr><td colspan="5" style="text-align:center; color:red;">Error loading data. Status: ${this.status}</td></tr>`;
      }
    }
  };
  http.open("GET", API_URL, true);
  http.send();
}

function renderFeedbackTable(feedbackArray) {
  const tableBody = document.getElementById("feedback-data");
  tableBody.innerHTML = "";

  if (feedbackArray.length === 0) {
    tableBody.innerHTML = `<tr><td colspan="5" style="text-align:center;">No feedback available.</td></tr>`;
    return;
  }

  feedbackArray.forEach((item) => {
    const row = tableBody.insertRow();
    row.id = `row-${item.id}`;

    row.insertCell().textContent = item.id;
    row.insertCell().innerHTML = `<span class="display-name">${item.name}</span>`;
    row.insertCell().innerHTML = `<span class="display-rating">${item.rating}</span>`;
    row.insertCell().innerHTML = `<span class="display-comment">${item.comment}</span>`;

    const actionsCell = row.insertCell();
    actionsCell.className = "actions-cell";
    actionsCell.innerHTML = `
            <button class="editButton" data-id="${item.id}" title="Edit"><i class="fas fa-pencil-alt"></i></button>
            <button class="deleteButton" data-id="${item.id}" title="Delete"><i class="fas fa-trash-alt"></i></button>
        `;
  });
}

// --- C (Create) ---
function openAddModal() {
  document.getElementById("addUserModal").style.display = "block";
  // Clear the form fields
  document.getElementById("name").value = "";
  document.getElementById("rating").value = "";
  document.getElementById("comment").value = "";
}

function closeAddModal() {
  document.getElementById("addUserModal").style.display = "none";
}

function saveNewFeedback() {
  // Get values from the add modal form (IDs: #name, #rating, #comment)
  const name = document.getElementById("name").value.trim();
  const ratingInput = document.getElementById("rating").value.trim();
  const comment = document.getElementById("comment").value.trim();

  if (!name || !ratingInput || !comment) {
    alert("Please fill in all fields.");
    return;
  }

  // Validation for rating
  const rating = parseInt(ratingInput);
  if (isNaN(rating) || rating < 1 || rating > 5) {
    alert("Rating must be a number between 1 and 5.");
    return;
  }

  const newFeedback = {
    name: name,
    rating: rating,
    comment: comment,
  };

  const http = new XMLHttpRequest();
  http.onreadystatechange = function () {
    if (this.readyState === 4) {
      if (this.status === 201 || this.status === 200) {
        closeAddModal();
        fetchFeedback();
      } else {
        alert("Error adding feedback: " + this.statusText);
      }
    }
  };
  http.open("POST", API_URL, true);
  http.setRequestHeader("Content-type", "application/json");
  http.send(JSON.stringify(newFeedback));
}

function handleTableActions(event) {
  const target = event.target.closest("button");
  if (!target) return;

  const feedbackId = target.dataset.id;
  const row = document.getElementById(`row-${feedbackId}`);

  if (target.classList.contains("editButton")) {
    // Toggle save/edit based on 'editing' class
    if (row.classList.contains("editing")) {
      saveEditedFeedback(row, feedbackId);
    } else {
      toggleEditMode(row, feedbackId);
    }
  } else if (target.classList.contains("deleteButton")) {
    openDeleteModal(feedbackId);
  }
}

// --- D (Delete) ---
let feedbackToDeleteId = null;

function openDeleteModal(id) {
  feedbackToDeleteId = id;
  const row = document.getElementById(`row-${id}`);
  const nameElement = row.querySelector(".display-name");
  const name = nameElement ? nameElement.textContent : "this user";

  // Set the confirmation message
  document.getElementById(
    "confirm-message"
  ).textContent = `Are you sure you want to delete this feedback from ${name}?`;
  document.getElementById("deleteConfirmModal").style.display = "block";
}

function closeDeleteModal() {
  document.getElementById("deleteConfirmModal").style.display = "none";
  feedbackToDeleteId = null;
}

function performDelete() {
  if (!feedbackToDeleteId) return;

  const id = feedbackToDeleteId;
  closeDeleteModal();

  const http = new XMLHttpRequest();
  http.onreadystatechange = function () {
    if (this.readyState === 4) {
      if (this.status === 200) {
        fetchFeedback();
      } else {
        alert("Error deleting feedback: " + this.statusText);
      }
    }
  };
  http.open("DELETE", `${API_URL}/${id}`, true);
  http.send();
}

// --- U (Update) ---
function toggleEditMode(row, id) {
  const isEditing = row.classList.contains("editing");
  const editButton = row.querySelector(".editButton");

  const displayName = row.querySelector(".display-name");
  const displayRating = row.querySelector(".display-rating");
  const displayComment = row.querySelector(".display-comment");

  if (!isEditing) {
    row.classList.add("editing");
    editButton.title = "Save";
    editButton.innerHTML = '<i class="fas fa-save"></i>';

    const nameValue = displayName.textContent;
    // Edit Name ID: #editedName
    displayName.innerHTML = `<input type="text" class="editable-input" id="editedName" value="${nameValue}">`;

    const ratingValue = displayRating.textContent;
    // Edit Rating ID: #editedRating
    displayRating.innerHTML = `<input type="number" class="editable-input" id="editedRating" value="${ratingValue}" min="1" max="5">`;

    const commentValue = displayComment.textContent;
    // Edit Comment ID: #editedComment
    displayComment.innerHTML = `<input type="text" class="editable-input" id="editedComment" value="${commentValue}">`;

    // Add Enter key listener to all editable inputs
    row.querySelectorAll(".editable-input").forEach((input) => {
      input.addEventListener("keydown", (e) => {
        if (e.key === "Enter") {
          e.preventDefault();
          saveEditedFeedback(row, id);
        }
      });
    });
  } else {
    // Fallback for button click when in editing mode
    saveEditedFeedback(row, id);
  }
}

function saveEditedFeedback(row, id) {
  // Get values from editable inputs (IDs: #editedName, #editedRating, #editedComment)
  const newName = row.querySelector("#editedName")
    ? row.querySelector("#editedName").value.trim()
    : "";
  const newRatingInput = row.querySelector("#editedRating")
    ? row.querySelector("#editedRating").value.trim()
    : "";
  const newComment = row.querySelector("#editedComment")
    ? row.querySelector("#editedComment").value.trim()
    : "";

  if (!newName || !newRatingInput || !newComment) {
    alert("All fields must be filled.");
    return;
  }

  // Validation for rating
  const ratingValue = parseInt(newRatingInput);
  if (isNaN(ratingValue) || ratingValue < 1 || ratingValue > 5) {
    alert("Rating must be a number between 1 and 5.");
    fetchFeedback(); // Revert UI
    return;
  }

  const updatedData = {
    name: newName,
    rating: ratingValue,
    comment: newComment,
  };

  const http = new XMLHttpRequest();
  http.onreadystatechange = function () {
    if (this.readyState === 4) {
      if (this.status === 200) {
        revertToDisplayMode(row, updatedData);
      } else {
        alert("Error updating feedback: " + this.statusText);
        fetchFeedback(); // Re-fetch to sync with API data
      }
    }
  };

  http.open("PUT", `${API_URL}/${id}`, true);
  http.setRequestHeader("Content-type", "application/json");
  http.send(JSON.stringify(updatedData));
}

function revertToDisplayMode(row, data) {
  row.classList.remove("editing");
  const editButton = row.querySelector(".editButton");
  if (editButton) {
    editButton.title = "Edit";
    editButton.innerHTML = '<i class="fas fa-pencil-alt"></i>';
  }

  // Update the table cells with the new data
  row.querySelector(
    "td:nth-child(2)"
  ).innerHTML = `<span class="display-name">${data.name}</span>`;
  row.querySelector(
    "td:nth-child(3)"
  ).innerHTML = `<span class="display-rating">${data.rating}</span>`;
  row.querySelector(
    "td:nth-child(4)"
  ).innerHTML = `<span class="display-comment">${data.comment}</span>`;
}

// Close modals when clicking outside
window.onclick = function (event) {
  const addUserModal = document.getElementById("addUserModal");
  const deleteConfirmModal = document.getElementById("deleteConfirmModal");

  if (event.target == addUserModal) {
    closeAddModal();
  }
  if (event.target == deleteConfirmModal) {
    closeDeleteModal();
  }
};
