// Import the HashMap class from the java.util package.
import java.util.HashMap;

// This class demonstrates how to find the frequency of characters in a string.
public class FrequencyofCharacters{
   public static void main(String[] args) {

    // The input string to be processed.
    String str="programming";

    // Create a new HashMap to store characters and their frequencies.
    HashMap<Character, Integer> map=new HashMap<>();

    // Loop through each character of the string.
    for(int i=0;i<str.length();i++){
        // Get the character at the current index.
        char ch=str.charAt(i);
        // Check if the map already contains the character.
        if(map.containsKey(ch)){
            // If it does, increment its frequency count.
            map.put(ch,map.get(ch)+1);
        }
        else{
            // If it doesn't, add the character to the map with a frequency of 1.
            map.put(ch,1);
        }
    }
    // Print the final map of character frequencies.
    System.out.println(map.toString());
   }
}
