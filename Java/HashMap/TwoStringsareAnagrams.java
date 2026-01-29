import java.util.HashMap;

// This program determines if two strings are anagrams of each other.
// Anagrams are words or phrases formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
public class TwoStringsareAnagrams {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        // Create two HashMaps to store the frequency of each character in the respective strings.
        // The key is the character, and the value is its count.
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        // Iterate through the first string to build its character frequency map.
        for(char ch:str1.toCharArray()){
            if(map1.containsKey(ch)){
                // If the character is already in the map, increment its count.
                map1.put(ch, map1.get(ch)+1);
            }else{
                // Otherwise, add the character to the map with a count of 1.
                map1.put(ch, 1);
            }        
        }
        System.out.println(map1.toString());

        // Iterate through the second string to build its character frequency map.
         for(char ch:str2.toCharArray()){
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch)+1);
            }else{
                map2.put(ch, 1);
            }        
        }
        System.out.println(map2.toString());

        // --- Anagram Check ---
        // First, perform a quick check. If the strings have different lengths,
        // they cannot be anagrams.
        if (str1.length() != str2.length()) {
            System.out.println("Strings are NOT Anagram because they have different lengths.");
        // If the lengths are the same, compare the character frequency maps.
        // The .equals() method for HashMaps checks if both maps have the same keys
        // and that the values for each corresponding key are also equal.
        // This is a concise way to verify that both strings have the exact same characters
        // with the exact same frequencies.
        } else if (map1.equals(map2)) {
            System.out.println("Both the Strings are Anagram");
        } else {
            System.out.println("Strings are NOT Anagram");
        }
    }
}
