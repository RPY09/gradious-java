import java.util.Scanner;

public class Strings {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
         System.out.print("Enter a String: ");
        String p=sc.nextLine();
        System.out.println(p.length());
        // String result=reverse_String(p);
        // String result=word_reve_String(p);
        String result=trim_Space(p);
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
//===================================================================================WORD SPACE REVERSE=======================================================================
    static String word_reve_String(String p){
        String result="";
       String word="";
       for(int i=p.length()-1;i>=0;i--){
        char ch=p.charAt(i);
        
        if(ch==' '){
            result+=word+" ";
            word="";        
        }
        else{
            word=ch+word;
        }
       }
       result+=word;
        return result;
    }
//=============================================================================TRIM SPACES TO SINGLE SPACE======================================================================
    static String trim_Space(String p){
        String result="";
        String word="";
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            
            if(ch==' '){
                if (p.charAt(i+1)!=' ') {   
                    result+=word+" ";
                    word="";        
                }
            }
            else{
                word=ch+word;
            }
        }
        result+=word;
        System.out.println(result.length());
        return result;
        
    }
}
