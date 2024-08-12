import java.util.Arrays;
import java.util.Scanner;

public class SetMatZero {
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

        setMatrixZero(arr,n,m);

        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }

    static void setMatrixZero(int[][] arr,int n,int m){
        boolean rowZero = false, colZero = false;

        // Determine if the first row needs to be zeroed
        for (int j = 0; j < m; j++) {
            if (arr[0][j] == 0) {
                rowZero = true;
                break;
            }
        }

        // Determine if the first column needs to be zeroed
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                colZero = true;
                break;
            }
        }

        // Use the first row and first column to mark zero rows and columns
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if (rowZero) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }
    
        // Zero out the first column if needed
        if (colZero) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
