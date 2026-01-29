package Arrays;
import java.util.Scanner;

public class D2array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // matarray();
        // summat();
        // abovenumsum();
        // arr90deg();
        // magicmatrix();
        // matclock();
        transpose();
      
    }
//=========================================================================2D ARRAYS=================================================================================
    static void matarray(){
         System.out.print("enter the array column size: ");
        int n =sc.nextInt();
         System.out.print("enter the array row size: ");
        int m =sc.nextInt();
        System.out.println("enter the array element: ");
        int [][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ SUM OF ROW MATRIX AND COLUMN MATRIX===========================================================
    static void summat(){
         System.out.print("enter the array row size: ");
        int n =sc.nextInt();
         System.out.print("enter the array column size: ");
        int m =sc.nextInt();
        System.out.println("enter the array elements: ");
        int [][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print("Enter row["+i+"] of column ["+j+"]  element: ");
              a[i][j]=sc.nextInt();
            }
        }if(n==m){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=0; j<m; j++){
                    sum+=a[i][j];//for row sum
                    // sum+=a[j][i];//for column sum
                }
                System.out.println("Sum of row["+i+"] is "+sum);
            }
        }
        else{
            System.out.println("Its not a Square matrix..!");
        }
    }
//================================================================= ARRAY NUM SUM ABOVE=====================================================================================
static void abovenumsum(){
    System.out.print("enter the array row size: ");
        int n =sc.nextInt();
         System.out.print("enter the array column size: ");
        int m =sc.nextInt();
        System.out.println("enter the array elements: ");
        int [][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print("Enter row["+i+"] of column ["+j+"]  element: ");
              a[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=a[i][j]+a[i-1][j];
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(a[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
    static void arr90deg(){
        System.out.print("enter the array row size: ");
        int n =sc.nextInt();
         System.out.print("enter the array column size: ");
        int m =sc.nextInt();
        System.out.println("enter the array elements: ");
        int [][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print("Enter row["+i+"] of column ["+j+"]  element: ");
              a[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(a[i][j]+"  ");
            }
            System.out.println(" ");
        }
        System.out.println("ARRAY AFTER 90  DEG ROTATION");
        for(int j=m-1;j>=0;j--){
            for(int i=0;i<n;i++){
               System.out.print(a[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
// ======================================================================
    static void magicmatrix(){
       int arr[][] = {{2,7,6},{9,5,1},{4,3,8}};
int n = arr.length;
int sum1 = 0; // sum of first row
boolean magic = true;

// Calculate sum of first row
for (int j = 0; j < n; j++) {
    sum1 += arr[0][j];
}

int sum3 = 0; // main diagonal
int sum4 = 0; // secondary diagonal

for (int i = 0; i < n; i++) {
    int sum = 0;  // row sum
    int sum2 = 0; // column sum

    for (int j = 0; j < n; j++) {
        sum += arr[i][j];
        sum2 += arr[j][i];
    }

    // if row OR column doesn't match expected sum, not magic
    if (sum != sum1 || sum2 != sum1) {
        magic = false;
        break;
    }

    sum3 += arr[i][i];           // main diagonal sum
    sum4 += arr[i][n - 1 - i];   // secondary diagonal sum
}

// Final check
if (magic && sum3 == sum1 && sum4 == sum1) {
    System.out.println("MAGIC SQUARE..");
} else {
    System.out.println("Not a MAGIC SQUARE..");
}

    }
    static void matclock(){
         System.out.print("enter the array row size: ");
        int n =sc.nextInt();
         System.out.print("enter the array column size: ");
        int m =sc.nextInt();
        System.out.println("enter the array elements: ");
        int [][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print("Enter row["+i+"] of column ["+j+"]  element: ");
              arr[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        int rt=0,cl=0,rb=n-1,cr=m-1;
        for(int j=rt;j<cr;j++){
        for(int i=cl;i<=cr;i++){
            System.out.print(arr[rt][i]+" ");
        }
        rt++;
        for(int i=rt;i<=rb;i++){
            System.out.print(arr[i][cr]+" ");
        }
        cr--;
         for(int i=cr;i>=cl;i--){
            System.out.print(arr[rb][i]+" ");
        }
        rb--;
         for(int i=rb;i>=rt;i--){
            System.out.print(arr[i][cl]+" ");
        }
        cl++;
    }
    }
    static void transpose(){
         System.out.print("enter the array row size: ");
        int n =sc.nextInt();
         System.out.print("enter the array column size: ");
        int m =sc.nextInt();
        System.out.println("enter the array elements: ");
        int [][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print("Enter row["+i+"] of column ["+j+"]  element: ");
              a[i][j]=sc.nextInt();
            }
            System.out.println( );
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println( );
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]);
            }
            System.out.println( );
        }
    }
   
}
