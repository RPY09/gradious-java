import java.util.Scanner;
public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        int a=7,b=0,c;
    --a;
    a--;
    ++b;
    c=a^b;
    System.out.print(c);
    }
    
}