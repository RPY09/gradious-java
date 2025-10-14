import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        // stringfreq();
        twoSum();
    }
    static void stringfreq(){
        String words="rpranavyadav";
        // int count=0;
        HashMap<Character,Integer> letters=new HashMap<>();
        for(int i=0;i<words.length();i++){
            char ch=words.charAt(i);
            if(letters.containsKey(ch)){
                int count =letters.get(ch);
                letters.put(ch,count+1);
            }
            else{
                letters.put(ch,1);
            }
        }
        System.out.println(letters);
    }
    static void twoSum(){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=10;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println(left +","+right);
            }
            if(arr[left]+arr[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
