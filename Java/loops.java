import java.util.Scanner;
public class loops {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
       multi23();
    }
    static void multi23(){
        System.out.print("Enter range: ");
        int n=sc.nextInt();
        int i=2,j=3,count=0;
        // for(;i<=n&&count<=n;i+=2,j+=3){
        //     System.out.print(" "+i+"  "+ j);
        //     count++;
        // }
        // System.out.println(j);
        while(i<=n){
            System.out.print(" "+i+" "+j);
            i+=2;
            j+=3;
        }
    }
}
