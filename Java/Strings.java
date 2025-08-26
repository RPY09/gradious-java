import java.util.Scanner;

public class Strings {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // String a="       aaaaaaaaaa   bb    ccc   ";
        //  System.out.println("Enter a String: ");
        // String p="viii";
        // System.out.println(p.length());
        // String result=reverse_String(p);
        // String result=word_reve_String(p);
        // String result=trim_Space(p);
        // String result=add_num_String();

        // int  result=len_last_word(p);
        // System.out.println(result);
        // anagram();
        // System.out.println(romantoint(p));
        // String arr[]={"ab","a"};
        // System.out.println(arr[0].charAt(0));
        // System.out.println(longest_prefix(arr));
        
        binaryadd();
    }
//================================================================================REVERSE OF THE STRING========================================================================
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
//===================================================================================LENGTH OF LAST WORD IN THE STRING==========================================================
    static int len_last_word(String p){
        String result="";
        p.trim();
        for(int i=p.length()-1;i>=0;i--){
            char ch=p.charAt(i);
            if(ch==' '){
                break;
            }
            result+=ch;
        }   
        return result.length();
    }
    static void anagram(){
        System.out.print("Enter First String");
        String ana1=sc.nextLine().toLowerCase();
        System.out.print("Enter second String");
        String ana2=sc.nextLine().toLowerCase();
        int count=0;
        if(ana1.length()==ana2.length()){
            for(int i=0;i<ana1.length();i++){
                String result="";
                char ch=ana1.charAt(i);
                result+=ch;
                if(ana2.contains(result)){
                    ana2=ana2.replaceFirst(result,"");
                    System.out.println(ana2);
                    count++;
                }
            }
            if(count==ana1.length()){
                System.out.println("It is a anagram");
            }
            else{
                System.out.println("Its not the anagram");
            }
        }
        else{
            System.out.println("length should be same for both strings..!");
    }
}
    static int romantoint(String s){
        s=s.toUpperCase();
         int sum=0;
        int num=0;
        int count=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i<s.length()-1 && ch==s.charAt(i+1)){
                count++;
            }
            
        }
        if(count<=2){
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                switch(ch){
                    case 'I':
                    num=1;
                    break;

                    case 'V':num=5;
                    break;
                    case 'X':num=10;
                    break;
                    case 'L':num=50;
                    break;
                    case 'C':num=100;
                    break;
                    case 'D':num=500;
                    break;
                    case 'M':num=1000;
                    break;
                }
            if(i<s.length()-1 && num<romantoint(String.valueOf(s.charAt(i+1)))){
                sum-=num;
            }
            else{
                sum+=num;
            }
            }
        }
        else{
            System.out.println("roman is wrong");
        }
        return sum;
    }
    static String longest_prefix(String[] arr){
        String res="";
        for(int i=0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);

            for(int j=1;j<arr.length;j++){
                if(i<arr[j].length() && arr[j].charAt(i)!=ch){
                    return res;
                }
            }
            res+=ch;
        }
        return res;
    }
    static void binaryadd() {
        String a = "1";
        String b = "";
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        String res = "";
        // Loop until both strings are processed and carry is zero
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = digitA + digitB + carry;
            // Compute current digit and new carry
            if (sum == 0) {
                res = "0" + res;
                carry = 0;
            } else if (sum == 1) {
                res = "1" + res;
                carry = 0;
            } else if (sum == 2) {
                res = "0" + res;
                carry = 1;
            } else if (sum == 3) {
                res = "1" + res;
                carry = 1;
            }
            i--;
            j--;
        }
        System.out.println(res);
    }
 
}
