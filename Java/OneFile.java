import java.util.Arrays;

public class OneFile {
    public static void main(String args[]){
        
        int arr[]={1,0,6,0,3,0,5,0,6,6,6,9};
        // int[] result=nonorder(arr);
        int [] result=order(arr);
        // int [] result=summtarget(arr);
        System.out.println(Arrays.toString(result));
        
    }
    static int[] summtarget(int[] arr){
        int target=7;
        int start=0;
        int sum=0;
        for(int end=0;end<arr.length;end++){
            sum+=arr[end];
            while(sum>target&&start<end){
                sum-=arr[start];
                start++;
            }
            if(sum==target){
                return new int[]{start, end};
            }
        }
        return null;

    }

    static int[] order(int[] arr){
        int start=0;
        for(int end=0;end<arr.length;end++){
            if(arr[end]!=0){
                int t=arr[start];
                arr[start]=arr[end];
                arr[end]=t;
                start++;
            }
        }
        return arr;
    }

    static int[] nonorder(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            if(arr[start]!=0){
                start++;
            }
            else if(arr[end]==0){
                end--;
            }
            else{
                int t=arr[start];
                arr[start]=arr[end];
                arr[end]=t;
                start++;
                end--;
            }
        }
        return arr;
    }
}
