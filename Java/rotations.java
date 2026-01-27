import java.util.Arrays;

public class rotations {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k =3;
        // leftRotate(arr,k);
        System.out.println("After Left rotation: " + Arrays.toString(arr));
        rightRotate(arr,k);
        System.out.println("After Right rotation: " + Arrays.toString(arr));
    }
    public static void leftRotate(int[] arr,int k){// left rotate or Anti-Clock wise is same
        int n=arr.length;
        k=k%n;             //Key Rule and important for rotations 
        reverse(arr,0,k-1);//Reverse the first k elements
        reverse(arr,k,n-1);//Reverse the remaining elemnts from k to n-1
        reverse(arr,0,n-1);//Reverse the whole Array
    }

    public static void rightRotate(int[] arr,int k){//Right Rotate or ClockWise is same just from above left rotate palce the last function to be first that's it
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);//Reverse the whole Array 
        reverse(arr,0,k-1);//Reverse the first K elements
        reverse(arr,k,n-1);//REverse the remaining elements from k to n-1
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
