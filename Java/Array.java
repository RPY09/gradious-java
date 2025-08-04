import java.util.Scanner;
public class Array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        // tryarr();
        sumeven();
       
    }
    static void tryarr(){
         System.out.print("enter the array size");

        int n =sc.nextInt();
        System.out.print("enter the array element");
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        for(int i:a){
            System.out.print(i+"  ");
        }
    }

    static void sumeven(){
     System.out.print("enter the array size");

        int n =sc.nextInt();
        System.out.print("enter the array element");
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i:a){
            sum+=i;
        }
 System.out.print(sum);
}
}

