import java.util.Scanner;
public class prime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        // primes();
        // sumeven();
        // maxarr();
        // minarr();
        // pairsarr();
        // uniquenum();
        // bubbleSortStrings();
    //    productarr();
    addOne();
        
    }
    
//=============================================================================PRIME NUMBER  =======================================================================

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
//=============================================================================SUM OF EVEN NUMBER IN ARRAY=======================================================================
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
//=============================================================================MAXIMUMM NUMBER IN ARRAY=======================================================================
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

//=============================================================================MINIMUM NUMBER IN ARRAY=======================================================================
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
//==============================================================================PAIRS OF ARRAYS================================================================================
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
//=============================================================================BUBBLE SORT OF ARRAY===================================================================
    static void bubbleSortStrings() {
        String[] arr = {"apple", "orange", "banana", "grape", "kiwi"};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
//=============================================================================PRODUCT OF NUMBER IN ARRAY=======================================================================
    static void productarr(){
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        System.out.println("enter the array element");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //  for(int i=0;i<n;i++){
        //     System.out.print("[ "+arr[i]+" ]"); //debugging
        // }
        int product=1;
        for(int i=0;i<n;i++){
            product*=arr[i];
        }
        // System.out.println(product); debugging
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                result[i]=product/arr[i];
            }
            else{
                System.out.println(product+" is not divisible by "+arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("[ "+result[i]+" ]");
        }
    }
    static void addOne () {  // Don't change the number of parameters
    int[] digits = new int[]{9, 9, 9};
    int n = digits.length;
    int carry = 1;
    for (int i = n - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        digits[i] = sum % 10;
        carry = sum / 10;
    }
    int[] res;
    if (carry > 0) {
        res = new int[n + 1];
        res[0] = carry;
        for (int i = 0; i < n; i++) {
            res[i + 1] = digits[i];
        }
    } else {
        res = digits;
    }
    // Print the array
    System.out.print("[ ");
    for (int i = 0; i < res.length; i++) {
        System.out.print(res[i] + ",");
    }
    System.out.println("]");
}
}