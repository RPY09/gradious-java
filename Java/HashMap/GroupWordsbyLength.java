// Import necessary classes from the Java utility library.
import java.util.ArrayList; // Used for creating a dynamic list of strings.
import java.util.HashMap;   // Used for storing key-value pairs (length -> list of words).
import java.util.List;      // The interface for lists.
import java.util.Map;       // The interface for maps.

/**
 * This program demonstrates how to group a list of words by their length.
 * It uses a HashMap where the key is the length of the word and the value is a list of words of that length.
 */
public class GroupWordsbyLength {
    public static void main(String[] args) {
        // An array of strings to be grouped.
        String[] words = {"hi", "hello", "bye", "java", "code"};
        
        // Create a HashMap to store the groups. 
        // The key is an Integer (word length), and the value is a List of Strings (words of that length).
        Map<Integer, List<String>> map = new HashMap<>();

        // Iterate over each word in the 'words' array.
        for (String word : words) {
            // Get the length of the current word.
            int len = word.length();
            
            // The computeIfAbsent method is used to add the word to the map.
            // 1. It checks if the key 'len' is already in the map.
            // 2. If the key is not present (absent), it computes a value using the provided lambda expression (k -> new ArrayList<>()).
            //    In this case, it creates a new empty ArrayList.
            // 3. This new ArrayList is then put into the map with 'len' as the key.
            // 4. The method then returns the value associated with the key (either the existing list or the newly created one).
            // 5. Finally, .add(word) is called on that list to add the current word to it.
            map.computeIfAbsent(len, k -> new ArrayList<>()).add(word);
        }

        // Iterate over the map and print each group.
        // The forEach method takes a lambda expression to perform an action for each key-value pair.
        // 'k' represents the key (length) and 'v' represents the value (list of words).
        map.forEach((k, v) -> System.out.println(k + " → " + v));
    }
}
