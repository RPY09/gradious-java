import java.util.Scanner;

public class D2array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // matarray();
        summat();
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
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0; j<m; j++){
                // sum+=a[i][j];
                sum+=a[j][i];//for column sum
            }
            System.out.println("Sum of row["+i+"] is "+sum);
        }
    }
}
