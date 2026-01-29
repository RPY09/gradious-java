// Import the HashMap class from the java.util package.
import java.util.HashMap;

// This class finds and prints the first non-repeating character in a string.
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // The input string to analyze.
        String str="aabbcde";

        // Create a HashMap to store characters as keys and their frequencies as values.
        HashMap<Character,Integer> map=new HashMap<>();

        // First pass: Build the frequency map for each character.
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // Check if the character is already in the map.
            if(map.containsKey(ch)){
                // If it is, increment its frequency count.
                map.put(ch,map.get(ch)+1);
            }else{
                // If it's not, add it to the map with a frequency of 1.
                map.put(ch,1);
            }
        }

        // Second pass: Iterate through the original string to find the *first*
        // character with a frequency of 1.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println("The first non-repeating character is: " + ch);
                break; // Exit the loop as soon as the first one is found
            }
        }
    }
}
