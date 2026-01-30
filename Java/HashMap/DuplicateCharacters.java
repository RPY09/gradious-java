import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str="programming";
        // Create a LinkedHashMap to store characters and their frequencies.
        // LinkedHashMap maintains the insertion order of keys.
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        // Iterate over the string to count character frequencies.
        for(char ch:str.toCharArray()){
            // getOrDefault returns the existing value for the key, or 0 if the key is not present.
            // This simplifies the logic for both adding a new character and incrementing an existing one.
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // Iterate over the map's keyset to find and print duplicate characters.
        for(char keys:map.keySet()){
            // If the frequency of a character is greater than 1, it's a duplicate.
            if(map.get(keys)>1){
                System.out.print(keys);
            }
        }
    }
}
