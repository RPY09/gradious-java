// Import all classes from the java.util package, including HashMap.
import java.util.*;

// This class calculates the frequency of each word in a given string.
public class FrequencyofWords {
    public static void main(String[] args) {
        // The input string containing the words to count.
        String str="java is easy and java is powerful";
        
        // Create a HashMap to store words (String) as keys and their frequencies (Integer) as values.
        HashMap <String,Integer> map=new HashMap<>();
        
        // Split the input string into an array of words using space as a delimiter.
        String[] arr=str.split(" ");
        
        // Iterate through each word in the array.
        for(String words:arr){
            // Check if the map already contains the word.
            if(map.containsKey(words)){
                // If the word exists, increment its frequency count by 1.
                map.put(words,map.get(words)+1);
            }
            else{
                // If the word is not in the map, add it with a frequency of 1.
                map.put(words, 1);
            }
        }
        // Print the final HashMap, which shows each word and its frequency.
        System.out.println(map.toString());
    }
}
