import java.util.Arrays;
import java.util.Scanner;

public class PeaKII {
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
        scanner.close();

        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }

    static int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        return findPeak(mat, 0, n - 1, m);
    }

    static int[] findPeak(int[][] mat, int left, int right, int rows) {
        int midCol = left + (right - left) / 2;

        // Find the maximum element in the middle column
        int maxRow = 0;
        for (int i = 0; i < rows; i++) {
            if (mat[i][midCol] > mat[maxRow][midCol]) {
                maxRow = i;
            }
        }

        // Check if the maximum element is a peak
        boolean isLeftGreater = midCol > left && mat[maxRow][midCol - 1] > mat[maxRow][midCol];
        boolean isRightGreater = midCol < right && mat[maxRow][midCol + 1] > mat[maxRow][midCol];

        if (!isLeftGreater && !isRightGreater) {
            // Found a peak
            return new int[]{maxRow, midCol};
        } else if (isLeftGreater) {
            // Move to the left half
            return findPeak(mat, left, midCol - 1, rows);
        } else {
            // Move to the right half
            return findPeak(mat, midCol + 1, right, rows);
        }
    }
}
