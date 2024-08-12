import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int  n = scanner.nextInt();
        int m= scanner.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        printDiagonal(arr, n, m);
    }

    static void printDiagonal(int[][] arr,int n,int m){
        int mode = 0, it = 0, lower = 0; 

        for (int t = 0; t < (2 * n - 1); t++) { 
            int t1 = t; 
            if (t1 >= n) { 
                mode++; 
                t1 = n - 1; 
                it--; 
                lower++; 
            } 
            else { 
                lower = 0; 
                it++; 
            } 
            for (int i = t1; i >= lower; i--) { 
                if ((t1 + mode) % 2 == 0) { 
                    System.out.print(arr[i][t1 + lower - i] + " "); 
                } 
                else { 
                    System.out.print(arr[t1 + lower - i][i] + " "); 
                } 
            } 
        } 
    }
}
