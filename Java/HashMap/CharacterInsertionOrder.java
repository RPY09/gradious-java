import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterInsertionOrder {
    public static void main(String[] args) {
        String str="hhtss";
        // Create a LinkedHashMap to store characters and their frequencies.
        // LinkedHashMap maintains the insertion order of keys.
        Map<Character,Integer> map=new LinkedHashMap<>();
        // Iterate over the string to count character frequencies.
        for(char ch:str.toCharArray()){
            // getOrDefault returns the existing value for the key, or 0 if the key is not present.
            // This simplifies the logic for both adding a new character and incrementing an existing one.
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // Print the map, which shows characters and their counts.
        System.out.println(map);
        // Iterate over the map's keyset to print the characters and their frequencies in insertion order.
        for(char key:map.keySet()){
            System.out.print(key+""+map.get(key));
        }
    }
}
