import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        // stringfreq();
        // twoSum();
        // twoSumHash();
        romanInteger();
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
    static void twoSumHash()
  {
         int arr[]={1,2,3,4,5,6,7,8,9};
        int target=10;
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < arr.length; i++)
    {
      int b = target - arr[i];
      if( map.get(b) != null )
      {
        // its a match..
        int bi = map.get(b);
        System.out.println(bi+","+ i);
      }
      else 
      {
        map.put(arr[i], i);
      }
    }
    }
    static void romanInteger(){
        HashMap<Character,Integer> Roman =new HashMap<>();
        Roman.put('i', 1);
        Roman.put('v', 5);
        Roman.put('x', 10);
        Roman.put('l', 50);
        Roman.put('c', 100);
        Roman.put('d', 500);
        Roman.put('m',1000);
        // System.out.println(Roman);
        String ronum="CMICIX".toLowerCase();
        int num=0;
        for(int i=0;i<ronum.length();i++){
            char ch=ronum.charAt(i);
            
            if(i+1<ronum.length() && Roman.get(ch)<Roman.get(ronum.charAt(i+1))){
                num+=-(Roman.get(ch));
            }
            else{
                num+=Roman.get(ch);
            }
            
        }
        System.out.println(num);
    }
}
