import java.util.Arrays;
import java.util.Scanner;

public class RotateK {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        scanner.close();

        rotateKTimes(arr,k);

        for(int[] i: arr){
            System.out.println(Arrays.toString(i));
        }
        
    }

    // Function to rotate each row of the matrix K times
    public static void rotateKTimes(int[][] matrix, int K) {
        int N = matrix.length;    // Number of rows
        int M = matrix[0].length; // Number of columns

        // Adjust K to be within the bounds of M
        K = K % M;

        // Rotate each row individually
        for (int i = 0; i < N; i++) {
            rotateRow(matrix[i], K);
        }
    }

    // Function to rotate a single row by K positions to the right
    public static void rotateRow(int[] row, int K) {
        int M = row.length;
        int[] temp = new int[M];

        // Copy the rotated elements into a temporary array
        for (int i = 0; i < M; i++) {
            temp[(i + K) % M] = row[i];
        }

        // Copy the rotated row back into the original row
        for (int i = 0; i < M; i++) {
            row[i] = temp[i];
        }
    }

}
