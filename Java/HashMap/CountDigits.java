import java.util.HashMap;

// This program counts the frequency of each digit present in a given integer.
public class CountDigits {
    public static void main(String[] args) {
        int num=122333;

        // Use a HashMap to store the frequency of each digit.
        // The key will be the digit (0-9), and the value will be its count.
        HashMap<Integer,Integer> map=new HashMap<>();

        // Loop continues as long as there are digits left to process.
        while(num>0){
            // Extract the last digit of the number using the modulo operator.
            int rem=num%10;

            // Check if the digit has been seen before.
            if(map.containsKey(rem)){
                // If the digit is already in the map, increment its count.
                map.put(rem,map.get(rem)+1);
            }else{
                // If it's the first time seeing this digit, add it to the map with a count of 1.
                map.put(rem, 1);
            }

            // Remove the last digit from the number using integer division.
            num=num/10;
        }

        // Iterate through all the digits (keys) in the map to print their frequencies.
        for(int key:map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }
    }
}
