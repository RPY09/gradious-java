import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {
    public static void main(String[] args) {
        // Input array of words
         String[] words = {"eat","tea","tan","ate","nat","bat"};
        
        // Create a HashMap to store groups of anagrams.
        // The key will be the sorted version of a word (representing the anagram group),
        // and the value will be a list of words belonging to that group.
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each word in the input array
        for (String word : words) {
            // Convert the word to a character array to sort it
            char[] arr = word.toCharArray();
            // Sort the character array. Anagrams will have the same sorted representation.
            Arrays.sort(arr); 
            // Create a string from the sorted character array to use as the map key
            String key = new String(arr);
            
            // Use computeIfAbsent to simplify adding the word to the correct group.
            // If the key (sorted word) is not already in the map, it creates a new ArrayList.
            // Then, it adds the original word to the list associated with the key.
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Iterate through the values of the map (the lists of anagrams) and print each group.
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
