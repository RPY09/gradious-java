import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        stringfreq();
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
}
