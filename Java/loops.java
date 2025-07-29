import java.util.Scanner;
public class loops {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
    //    multi23();
        // countint();
        System.out.println(unqiuenum());
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

    static void countint(){
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("The count of digits are: "+count);
    }
    static boolean unqiuenum(){
        System.out.print("Enter digits: ");
        int n=sc.nextInt();
        int c=n;
        while(n>0){
            int r=n%10;
            int f=c;
            int count=0;
            while(f>0){
                int r1=f%10;
                if(r==r1){
                    count++;
                    if(count>1){
                        // System.out.println("false");
                        return false;
                    }
                }
                f=f/10;
            }
            n=n/10;
        }
        // System.out.println("true");
        return true;
    }
}
