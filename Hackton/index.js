const stdIdInput = document.getElementById("std-id");
const userInput = document.getElementById("user");
const scoreInput = document.getElementById("score");
const rank = document.getElementById("ranks");
const stdForm = document.getElementById("std-form");

//======================================================ON SUBMISSION OF THE FORM=============================================================
stdForm.addEventListener("submit", (e) => {
  e.preventDefault();
  submit();
});

//======================================================ON CHANGE OF THE ID FIELD==============================================================
stdIdInput.addEventListener("input", () => {
  const stdId = stdIdInput.value.toUpperCase();
  const students = JSON.parse(localStorage.getItem("student-data") || "[]");

  const existing = students.find((s) => s.id === stdId); //FIND THE ID IN THE LIST

  if (existing) {
    userInput.value = existing.Name; //IF EXIST REPLACE THE EMPTY NAME FELID WITH ID MEMBER NAME
  } else {
    userInput.value = ""; //IF NOT EMPTY THE FELID TO ENTER THE DATA
  }
});

//============================================================TOGGLE BETWEEN THE THEMES FROM LIGHT TO DARK=====================================
function themes() {
  const body = document.body;
  const icon = document.querySelector(".theme i");

  body.classList.toggle("dark-theme");

  if (body.classList.contains("dark-theme")) {
    localStorage.setItem("theme", "dark");
    icon.classList.remove("bi-brightness-high");
    icon.classList.add("bi-moon");
  } else {
    localStorage.setItem("theme", "light");
    icon.classList.remove("bi-moon");
    icon.classList.add("bi-brightness-high");
  }
}

//========================================================ON FORM SUBMISSION=================================================================
function submit() {
  const stdId = stdIdInput.value.toUpperCase();
  const user = userInput.value;
  const score = parseFloat(scoreInput.value);

  let students = JSON.parse(localStorage.getItem("student-data") || "[]");

  //CHECKING THE ID EXISTS IN THE LIST
  const existing = students.find((s) => s.id === stdId);
  if (existing) {
    existing.Score = parseFloat(existing.Score) + score;
    userInput.value = existing.Name;
  } else {
    students.push({
      id: stdId,
      Name: user,
      Score: score,
    });
  }

  //SORT THE SCORE IN DESCENDING ORDER
  students.sort((a, b) => b.Score - a.Score);

  //GET DATA FROM THE LIST AND ONLY SELECTED UPTO 10 ELEMENTS AND DISPLAY IT
  localStorage.setItem("student-data", JSON.stringify(students));
  const topStudents = students.slice(0, 10); //SELECT ONLY FIRST 10 ELEMENTS OF THE LIST
  rank.innerHTML = "";

  topStudents.forEach((s, index) => {
    const li = document.createElement("li"); //CREATE LIST AND APPPEND TO THE PARENT WITH NAME AND SCORE
    li.textContent = `${index + 1}. ${s.Name}: ${s.Score}`; // FOR DISPLAY THE POISTION OF THE RANKERS
    rank.appendChild(li);
  });

  //TO EMPTY THE USER INPUT FELIDS
  stdIdInput.value = "";
  userInput.value = "";
  scoreInput.value = "";
}

//============================================================= DOM LOAD OPERATIONS=========================================================
document.addEventListener("DOMContentLoaded", () => {
  const savedTheme = localStorage.getItem("theme");

  if (savedTheme === "dark") {
    document.body.classList.add("dark-theme");
    const icon = document.querySelector(".theme i");
    icon.classList.remove("bi-brightness-high");
    icon.classList.add("bi-moon");
  }

  const students = JSON.parse(localStorage.getItem("student-data") || "[]");
  const topStudents = students.slice(0, 10);

  rank.innerHTML = "";
  topStudents.forEach((s, index) => {
    const li = document.createElement("li");
    li.textContent = `${index + 1}.     ${s.Name} :  ${s.Score}`;
    rank.appendChild(li);
  });
});
