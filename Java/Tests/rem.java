import java.util.Scanner;
public class rem {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // even_dash();
        System.out.println(duck());
    }
       
    static void even_dash(){
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        String result="";
        String rev="";
        while(n>0){
            int rem=n%10;
            int rem2=(n%100)/10;
            if(rem%2==0&&rem2%2==0&&rem2!=0){
                result+=rem+"-";
            }
            else{
                result+=rem+"";
            }
            n=n/10;
        }
        for(int i=result.length()-1;i>=0;i--){
            rev+=result.charAt(i);
        }
        System.out.println(rev);
    }
    
    static boolean duck(){
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean a=false;
        while(n>0){
            int rem=n%10;
            
            if(rem==0){
                       a=true;
                        return a;
            }
            n=n/10;
        }
        return a;
       
    }
    
}