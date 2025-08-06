import java.util.Arrays;
import java.util.Scanner;

public class OneFile {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int[] result = new int[0];
        int arr[] = {2, 3, 10, 2, 4, 8, 1};
        // Uncomment the desired function to test
        // int[] result = nonorder(arr);
        // int [] result = order(arr);
        // int [] result = summtarget(arr);
        // int [] result = rotateArray(arr);
        // int [] result = ThirdLargestElement(arr);
        // int [] result = maxDifference(arr);
        duplicatesarr();

        System.out.println(Arrays.toString(result));
    }

    //=====================================================================SUM TARGET OF ARRAY==========================================================================

    /**
     * Finds a contiguous subarray whose sum equals the target value.
     * Returns the start and end indices if found, otherwise returns null.
     */
    static int[] summtarget(int[] arr) {
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

    //=====================================================================ORDER ZERO OF ARRAY==========================================================================

    /**
     * Moves all non-zero elements to the front of the array, maintaining their order.
     * Zeros are moved to the end.
     */
    static int[] order(int[] arr) {
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            if (arr[end] != 0) {
                int t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
                start++;
            }
        }
        return arr;
    }

    //=====================================================================NON-ORDER ZERO OF ARRAY==========================================================================

    /**
     * Moves all non-zero elements to the front and zeros to the end,
     * but does not maintain the original order of non-zero elements.
     */
    static int[] nonorder(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != 0) {
                start++;
            } else if (arr[end] == 0) {
                end--;
            } else {
                int t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
                start++;
                end--;
            }
        }
        return arr;
    }

    //=====================================================================ROTATION OF ARRAY==========================================================================

    /**
     * Rotates the array to the right by a given number of steps.
     * Handles negative steps (left rotation) and steps greater than array length.
     */
    public static int[] rotateArray(int arr[]) {
        int n = arr.length;
        int steps = 0; // Number of steps to rotate (can be set as needed)
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

    //=====================================================================THIRD LARGEST OF ARRAY==========================================================================

    /**
     * Finds the third largest element in the array using a partial selection sort.
     * Returns an array containing the third largest value.
     */
    public static int[] ThirdLargestElement(int arr[]) {
        int n = arr.length;
        if (n < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements");
        }
        // Partial selection sort for top 3 elements
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        int[] result = new int[]{arr[2]};
        return result; // Third largest
    }

    //=====================================================================MAXIMUM DIFFERENCE OF ARRAY==========================================================================

    /**
     * Finds the maximum difference between two elements such that the larger element comes after the smaller one.
     * Returns an array containing the maximum difference, or -1 if not found.
     */
    public static int[] maxDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            int[] result = new int[]{-1};
            return result;
        }
        int minSoFar = arr[0];
        int maxDiff = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > minSoFar) {
                maxDiff = Math.max(maxDiff, arr[i] - minSoFar);
            } else if (arr[i] < minSoFar) {
                minSoFar = arr[i];
            }
        }
        int[] result = new int[]{maxDiff};
        return result;
    }

    //=====================================================================DUPLICATES IN ARRAY==========================================================================

    /**
     * Finds and prints all duplicate elements in the input array,
     * each only once and in order of their first appearance.
     * Does not use Set or List, only arrays.
     */
    static void duplicatesarr() {
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.println("enter the array element");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] printed = new int[n]; // 0 means not printed, 1 means printed as duplicate
        int[] res = new int[n]; // store duplicates
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (printed[i] == 1) continue; // already printed as duplicate
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    printed[j] = 1; // mark as printed
                }
            }
            if (isDuplicate) {
                res[idx++] = arr[i];
                printed[i] = 1;
            }
        }
        // Print the result array of duplicates
        if (idx == 0) {
            System.out.println("No duplicates found");
        } else {
            System.out.print("Duplicates: [");
            for (int i = 0; i < idx; i++) {
                System.out.print(res[i]);
                if (i < idx - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
