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
        // int s=sn(9);
        // int s=fact(5);
        String s="abc";
        char arr[]=s.toCharArray();

        // System.out.println(revback(s,0));
        System.out.println(permutation( arr[],0,arr.length));
    }
    static int sn(int num){
        if(num>0){
            return num+sn(num-1);
        }
        return 0;
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    static String revback(String s,int cp){
        if(s.length()==cp){;
            return "";
        }
        return revback(s, cp+1)+s.charAt(cp);
    }

    static void permutation(char arr,int start,int end){
       if(start==end){
        System.out.println(new String(arr));
        return;
       }
       for(int i=start;i<end;i++){
        swap(arr,start,end);
        permutation(arr, start+1, end);
        swap(arr,start,end);
       }
       return;
    }
    static void swap(char arr[], int a, int b) {
        char c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
  }

}
