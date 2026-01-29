import java.util.HashMap;

public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        // The input string to find the maximum occurring character
        String str="mississippi";
        // Create a HashMap to store the frequency of each character
        HashMap<Character,Integer> map=new HashMap<>();
        // Iterate through the string to count the frequency of each character
        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        // Initialize variables to store the maximum frequency and the character with the maximum frequency
        int max=0;
        char cha=' ';
        // Iterate through the HashMap to find the character with the maximum frequency
        for(char ch:map.keySet()){
            if(map.get(ch)>max){
                max=map.get(ch);
                cha=ch;
            }
        }
        // Print the character with the maximum frequency and its frequency
        System.out.println("Maximum character in the String \""+ str+"\" is \""+cha+"\" and repeats "+max+" times");
    }
}
