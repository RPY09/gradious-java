import java.util.Scanner;
public class loops {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
    //    multi23();
        // countint();
        // System.out.println(unqiuenum());
        // sumsquare();
        // squarepattern();
        // diagonal_pattern();
        // num_tri_pattern();
        // num_trirev_pattern();
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
        System.out.print("Enter digits to check a unique number: ");
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
                        return false;
                    }
                }
                f=f/10;
            }
            n=n/10;
        }
        return true;
    }

    static void sumsquare(){
        System.out.print("Enter the range of numbers: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(i*i+" ");
        }
    }
    static void squarepattern(){
        System.out.print("Enter the square size: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
    static void diagonal_pattern(){
         System.out.print("Enter the square size: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n||j==1||j==n||i==j||i==n-j+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    static void num_tri_pattern(){
          System.out.print("Enter the Pascal size: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            // Print spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            // Print numbers increasing
            for(int k = 1; k <= i; k++){
                System.out.print(i-k + " ");
            }
            
            for(int k = i - 1; k >= 1; k--){
                System.out.print(i-k + " ");
            }
            System.out.println();
        }
    }
    static void num_trirev_pattern(){
        System.out.print("Enter the Pascal size: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(i-k+1 + " ");
            }
            for(int k = i - 1; k >= 1; k--){
                System.out.print(i-k+1 + " ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = n-i; j >= 1; j--){
                System.out.print("  ");
            }
             for(int k = 1; k <= i; k++){
                System.out.print(i-k+1 + " ");
            }
             for(int k = i - 1; k >= 1; k--){
                System.out.print(i-k+1 + " ");
            }
            System.out.println();
        }
    }
}
