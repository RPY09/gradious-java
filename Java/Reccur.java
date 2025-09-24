public class Reccur {
    static void hello(int count){
    if(count>=5){         // base case
        return;
    }
    hello(count+2);
    System.out.println("a " + ++count);
    hello(count+1);
    System.out.println("b " + --count);
   
}

    public static void main(String[] args) {
        
        // hello(0);
        int s=sn(9);
        System.out.println(s);
    }
    static int sn(int num){
        if(num>0){
            return num+sn(num-1);
        }
        return 0;
    }
}
