import java.util.Arrays;

public class OneFile {
    public static void main(String args[]){
        
        int arr[]={2,3,10,2,4,8,1};
        // int[] result=nonorder(arr);
        // int [] result=order(arr);
        // int [] result=summtarget(arr);
        // int [] result = rotateArray(arr);
        // int [] result = ThirdLargestElement(arr);
        int [] result= maxDifference(arr);

        System.out.println(Arrays.toString(result));
        
    }
    static int[] summtarget(int[] arr){
        int target = -8;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == target) {
                    return new int[]{start, end};
                }
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
 
public static int[] rotateArray(int arr[]) {
    int n = arr.length;
    int steps = 0; // Number of steps to rotate
    steps = steps % n; // Normalize steps
    if (steps < 0) {
        steps = n + steps; // Convert left rotation to equivalent right rotation
    }
    int[] result = new int[n];
    int j = 0;
    for (int i = n - steps; i < n; i++) {
        result[j++] = arr[i];
    }
    for (int i = 0; i < n - steps; i++) {
        result[j++] = arr[i];
    }
    return result;
}

public static int[] ThirdLargestElement(int arr[]) {
    int n = arr.length;
    if (n < 3) {
        throw new IllegalArgumentException("Array must have at least 3 elements");
    }
    // Simple selection sort for 3 largest elements
    for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[j] > arr[i]) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
    }
    int []result=new int[]{arr[2]};
    return result; // Third largest
}

public static int[] maxDifference(int[] arr) {
    if (arr == null || arr.length < 2){ 
        int [] result = new int[]{-1};
        return result;}
    int minSoFar = arr[0];
    int maxDiff = -1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > minSoFar) {
            maxDiff = Math.max(maxDiff, arr[i] - minSoFar);
        } else if (arr[i] < minSoFar) {
            minSoFar = arr[i];
        }
    }
    int [] result=new int[]{maxDiff};
    return result;
}
}
