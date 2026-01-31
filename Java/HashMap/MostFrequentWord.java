import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void main(String[] args) {
        // The input string to be processed
        String str="the day is sunny the the sunny is is";
        
        // Create a HashMap to store words as keys and their frequencies as values
        HashMap<String,Integer> map=new HashMap<>();
        
        // Split the input string into an array of words based on spaces
        String arr[]=str.split(" ");
        
        // Iterate through each word in the array
        for(String word:arr){
          // Use getOrDefault to get the current count of the word, or 0 if it's not present.
          // Then, increment the count by 1 and put it back into the map.
          map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        // Initialize variables to track the most frequent word and its count
        String maxWord="";
        int max=0;
        
        // A Map.Entry represents a single key-value pair in a map.
        // By iterating through map.entrySet(), we can efficiently access both the
        // key (the word) and the value (its frequency) in each loop cycle.
        for(Map.Entry<String,Integer> e:map.entrySet()){
            // Check if the current word's count is greater than the max count found so far
            if(e.getValue()>max){
                // If it is, update the max count and the most frequent word
                max=e.getValue();
                maxWord=e.getKey();
            }
        }
        
        // Print the most frequent word and its frequency
        System.out.println(maxWord+"->"+max);
    }
}
