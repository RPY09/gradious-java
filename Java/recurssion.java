public class recurssion {
    public static void main(String[] args) {
        numbersBacktrack(9);
        // backTrackNumbers(1,9);
    }
    static void numbersBacktrack(int i){
        if(i<1){
            return;
        }
        numbersBacktrack(i-1);
        System.out.println(i);
    }
    static void backTrackNumbers(int i,int n){
        if(i>n){
            return ;
        }
        backTrackNumbers(i+1, n);
        System.out.println(i);
    }
}
