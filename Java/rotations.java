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
        clockwise90(clockwiseMatrix);
        System.out.println("\nAfter 90 Clockwise rotation:");
        printMatrix(clockwiseMatrix);

        int[][] antiClockwiseMatrix = new int[originalMatrix.length][];
        for (int i = 0; i < originalMatrix.length; i++) {
            antiClockwiseMatrix[i] = Arrays.copyOf(originalMatrix[i], originalMatrix[i].length);
        }
        antiClockwise90(antiClockwiseMatrix);
        System.out.println("\nAfter 90 Anti-Clockwise rotation:");
        printMatrix(antiClockwiseMatrix);
    }

    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void clockwise90(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix);
        for (int i = 0; i < n; i++) {
            int left = 0, right = matrix[i].length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void antiClockwise90(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix);
        for (int i = 0; i < n; i++) {
            int top = 0, bottom = matrix.length - 1;
            while (top < bottom) {
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
                top++;
                bottom--;
            }
        }
    }

    public static void transpose(int[][] matrix) {
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
