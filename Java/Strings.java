import java.util.Scanner;

public class Strings {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // String a="       aaaaaaaaaa   bb    ccc   ";
         System.out.println("Enter a String: ");
        String p=sc.nextLine();
        // System.out.println(p.length());
        // String result=reverse_String(p);
        // String result=word_reve_String(p);
        // String result=trim_Space(p);
        // String result=add_num_String();
        int  result=len_last_word(p);
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
        // System.out.println(result.length());
        return result;
        
    }
    static String add_num_String(){
        int sum=0;
        String p="first i brought 10 box next i bought 313 box next i bought 10000 box next i brougth 1 box";
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0'){
                int j=i;
                String num="";
                while(j<p.length()&&p.charAt(j)!=' '){
                    num+=p.charAt(j);
                    j++;
                }
                sum+=Integer.parseInt(num);
            }
        }
        System.out.println(sum);
        return null;
    }
    static int len_last_word(String p){
        String result="";
        p.trim();
        for(int i=p.length()-1;i>=0;i--){
            char ch=p.charAt(i);
            if(ch==' '){
                break;
            }
            result+=(ch);
        }   
        return result.length();
    }
}
