import java.util.Scanner;
public class prime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        // primes();
        sumeven();
        
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
            if(i%2==0){
                sum+=i;
            }
        }
 System.out.print(sum);
 
}
}