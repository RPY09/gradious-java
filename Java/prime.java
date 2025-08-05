import java.util.Scanner;
public class prime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        // primes();
        // sumeven();
        // maxarr();
        // minarr();
        // pairsarr();
        uniquenum();
        
    }
    

static void primes(){
    System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        int count=0;
        if (num <= 1) {
            System.out.println("It's not a prime.");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                count++;
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("It's a prime.");
            } else {
                System.out.println("It's not a prime.");
            }
        }
        System.out.println(count);
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
            if(a[i]%2==0){
                sum+=i;
            }
        }
 System.out.print("Sum of even number in array"+sum);
 
}
static void maxarr(){
    System.out.print("enter the array size");
        int n =sc.nextInt();
        System.out.print("enter the array element");
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i:a){
            if(i>max){
            max=a[i];
            }
        }
 System.out.print("Maximum nunber in array "+max);
}
static void minarr(){
    System.out.print("enter the array size");
        int n =sc.nextInt();
        System.out.print("enter the array element");
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i:a){
            if(i<min){
            min=a[i];
            }
        }
 System.out.print("Minimum nunber in array "+min);
}

static void pairsarr(){
     System.out.print("enter the array size ");
        int n =sc.nextInt();
        System.out.println("enter the array element");
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    // int max=0;
    // int p1=0,p2=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i+1;j<n;j++){
        //         sum=a[i]+a[j];
        //         if(sum>max){
        //             max=sum;
        //              p1=a[i];
        //              p2=a[j];
        //         }
        //         System.out.print(sum+"  ");
        //     }

        // }
        // System.out.println("\nmax element pair ["+p1+","+p2+"] = "+max);

        //optimize code
    int max=a[0],smax=0;
    for(int i=0;i<n;i++){
        if(a[i]>max){
            smax=max;
            max=a[i];
        }
        else if(a[i]>smax){
            smax=a[i];
        }
    }
    int sum=max+smax;
    System.out.println(max+","+smax+"="+sum);
}
//=====================================================================================UNIQUE NUMBER ARRAY=========================================================
static void uniquenum(){
     System.out.print("enter the array size ");
        int n =sc.nextInt();
        System.out.println("enter the array element");
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int unq=0;
        for(int i=0;i<n;i++){
            unq^=a[i];
        }
        System.out.println(unq);
}
}