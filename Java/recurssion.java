public class recurssion {
    public static void main(String[] args) {
        // numbersBacktrack(9);
        // backTrackNumbers(1,9);
        // System.out.println(sumOfNaturalNum(5));
        // System.out.println(backtrackSumOfNatural(0,9));
        // System.out.println(factorial(9));
        // System.out.println(backtrackFactorial(1,9));
        int [] arr={1,2,3,4,5};
        // int res[]=reverseArray(arr,0,arr.length-1);
        // for(int num:res){
        //     System.out.println(num+" ");
        // }
        String str="121";
        System.out.println(isPalindrome(str,0,str.length()));
    }

    //call the function and decrese the i to traverse upto the condition and return then start printing the numbers in backtrack and the input is given as a largest number upto we want to print;

    static void numbersBacktrack(int i){
        if(i<1){
            return;
        }
        numbersBacktrack(i-1);
        System.out.println(i);
    }

    //call the function and traverse upto the condition and return then start printing the elements in the reverse order this is backtracking;

    static void backTrackNumbers(int i,int n){
        if(i>n){
            return ;
        }
        backTrackNumbers(i+1, n);
        System.out.println(i);
    }

    //call the function and reduce the number till the 0 then return with adding the numbers from the 1-n;

    static int sumOfNaturalNum(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNaturalNum(n-1);
    }

    //call the function and increse the number till the wanted number and add the numbers from the n-1;

    static int backtrackSumOfNatural(int i,int n){
        if(i==n){
            return n;
        }
        return i+backtrackSumOfNatural(i+1, n);
    }

    //call the function and reduce the number till 1 and multiply the number from 1-n;

    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    //call the function and add the number till n and multiply the number from n-1;

    static int backtrackFactorial(int i,int n){
        if(i==n){
            return n;
        }
        return i*backtrackFactorial(i+1, n);
    }

    //call the funcion and then swap the elements and then when the i and n cross or meet at point then return the arr;

    static int[] reverseArray(int[] arr,int i, int n){
        if(i>=n){
            return arr;
        }
        swap(arr,i,n);
        return reverseArray(arr, i+1, n-1);
    }
    
    //swap the elements of the arr;

    static void swap(int[] arr,int i,int n){
        int t=arr[i];
        arr[i]=arr[n];
        arr[n]=t;
    }
    
    //

    static boolean isPalindrome(String s,int i,int n){
        if(i>=n){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(s, i+1, n);
    }
}
