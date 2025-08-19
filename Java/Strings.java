import java.util.Scanner;

public class Strings {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
         System.out.print("Enter a String: ");
        String p=sc.nextLine();
        // String result=reverse_String(p);
        String result=word_reve_String(p);
        System.out.println(result);
    }
//================================================================================REVERSE OF THE STRING=======================================
    static String reverse_String(String p){
       
        String r="";
        for(int i=p.length()-1;i>=0;i--){
            r+=p.charAt(i);
        }
        return r;
    }
    static String word_reve_String(String p){
        String result="";
       String word="";
       for(int i=p.length()-1;i>=0;i--){
        char ch=p.charAt(i);
        if(ch==' '){
            result+=word+" ";
            word="";        }
        else{
            word=ch+word;
        }
       }
       result+=word;
        return result;
    }
}
