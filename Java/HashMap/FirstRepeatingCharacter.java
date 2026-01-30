import java.util.HashMap;
import java.util.Map;

// This program finds the first repeating character in a string.
public class FirstRepeatingCharacter{
    public static void main(String[] args) {
        String str="abcab"; // The input string to process.
        // Create a HashMap to store the frequency of each character.
        Map<Character,Integer> map=new HashMap<>();
        // Iterate over the string to count the occurrences of each character.
        for(char ch:str.toCharArray()){
            // Get the current count of the character, or 0 if it's not present, then increment it.
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // Iterate over the string again to find the first character with a count greater than 1.
        for(char ch:str.toCharArray()){
            // Check if the character is repeating.
            if(map.get(ch)>1){
                // Print the first repeating character and exit the loop.
                System.out.println(ch);
                break;
            }
        }
    }
}
