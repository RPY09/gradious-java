import java.util.Arrays;

public class rotations {
    public static void main(String[] args) {
        // --- Array Rotations ---
        int[] originalArr = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println("--- Array Rotations ---");
        System.out.println("Original array: " + Arrays.toString(originalArr));

        int[] rightRotatedArr = Arrays.copyOf(originalArr, originalArr.length);
        rightRotate(rightRotatedArr, k);
        System.out.println("After Right rotation: " + Arrays.toString(rightRotatedArr));

        int[] leftRotatedArr = Arrays.copyOf(originalArr, originalArr.length);
        leftRotate(leftRotatedArr, k);
        System.out.println("After Left rotation: " + Arrays.toString(leftRotatedArr));
        System.out.println();

        // --- Matrix Rotations ---
        int[][] originalMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("--- Matrix Rotations ---");
        System.out.println("Original Matrix:");
        printMatrix(originalMatrix);

        int[][] clockwiseMatrix = new int[originalMatrix.length][];
        for (int i = 0; i < originalMatrix.length; i++) {
            clockwiseMatrix[i] = Arrays.copyOf(originalMatrix[i], originalMatrix[i].length);
        }
        clockwise90(clockwiseMatrix);//call this functions for 2 times it rotate 180deg for 3 times rotates 270deg
        System.out.println("\nAfter 90 Clockwise rotation:");
        printMatrix(clockwiseMatrix);

        int[][] antiClockwiseMatrix = new int[originalMatrix.length][];
        for (int i = 0; i < originalMatrix.length; i++) {
            antiClockwiseMatrix[i] = Arrays.copyOf(originalMatrix[i], originalMatrix[i].length);
        }
        antiClockwise90(antiClockwiseMatrix);//call this functions for 2 times it rotate 180deg for 3 times rotates 270deg
        System.out.println("\nAfter 90 Anti-Clockwise rotation:");
        printMatrix(antiClockwiseMatrix);
    }

    public static void rightRotate(int[] arr, int k) {// right rotate or Clock wise
        int n = arr.length;
        k = k % n;//Key Rule and important for rotations 
        reverse(arr, 0, n - 1);//Reverse the whole Array
        reverse(arr, 0, k - 1);//Reverse the first k elements
        reverse(arr, k, n - 1);//Reverse the remaining elemnts from k to n-1
    }

    public static void leftRotate(int[] arr, int k) {// left rotate or Anti-Clock wise is same just from above right rotate palce the last function call to be first call  that's it
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);//Reverse the first k elements
        reverse(arr, k, n - 1);//Reverse the remaining elemnts from k to n-1
        reverse(arr, 0, n - 1);//Reverse the whole Array
    }

    public static void reverse(int[] arr, int start, int end) {//revers means swap the elements
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void clockwise90(int[][] matrix) {//for Clockwise after transpose swap or reverse the Rows element
        int n = matrix.length;
        transpose(matrix);
        for (int rows = 0; rows < n; rows++) {
            int left = 0, right = matrix[rows].length - 1;//points the rows left and right indexs 
            while (left < right) {//swaps the elements until the condition is false 
                int temp = matrix[rows][left];
                matrix[rows][left] = matrix[rows][right];
                matrix[rows][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void antiClockwise90(int[][] matrix) {//for Anti-Clockwise after transpose swap or reverse the Columns element
        int n = matrix.length;
        transpose(matrix);
        for (int cols = 0; cols < n; cols++) {//points the cols top and bottom positions 
            int top = 0, bottom = matrix.length - 1;
            while (top < bottom) {//swaps the elements until condition is false
                int temp = matrix[top][cols];
                matrix[top][cols] = matrix[bottom][cols];
                matrix[bottom][cols] = temp;
                top++;
                bottom--;
            }
        }
    }

    public static void transpose(int[][] matrix) {//this makes that rows to columns and colums to rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
