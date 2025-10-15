public class recurssion {
    public static void main(String[] args) {
        // numbersBacktrack(9);
        // backTrackNumbers(1,9);
        // System.out.println(sumOfNaturalNum(5));
        // System.out.println(backtrackSumOfNatural(0,9));
        System.out.println(factorial(9));
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
    static int sumOfNaturalNum(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNaturalNum(n-1);
    }
    static int backtrackSumOfNatural(int i,int n){
        if(i==n){
            return n;
        }
        return i+backtrackSumOfNatural(i+1, n);
    }
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
