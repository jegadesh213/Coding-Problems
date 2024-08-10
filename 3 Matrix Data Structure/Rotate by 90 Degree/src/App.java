import java.util.Arrays;
import java.util.Scanner;

public class App {
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

        // Brute Force approach to solve this problem is to create new array and solve which leads to O(n^2)
        // Rotate(arr,n,m);

        // Here for the optimal way we can do Trasporse for the Matrix and do the Reverse of the Matrix which we Transporsed
        // Where we will use three Methods [ ROTATEEFF , SWAP & REVERSE ]
        RotateEff(arr, n, m);
    }

    static void Rotate(int[][] arr,int n,int m){
        int[][] arr2 = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[j][n-1-i] = arr[i][j];
            }
        }

        
        for(int[] i : arr2){
            System.out.println(Arrays.toString(i));
        }
    }

    // Below Methods are the Optimal Methods
    static void  RotateEff(int[][] arr,int n,int m){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<m;j++){
                // Swap the each element which is not diagonal
                swap(arr,i,j,j,i);
            }
        }

        for(int i=0;i<m;i++){
            reverse(arr,i,m);
        }

        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }

    static void swap(int[][] arr,int a,int b,int c,int d){
        int temp = arr[a][b];
        arr[a][b] = arr[c][d];
        arr[c][d] = temp;
    }
    
    static void reverse(int[][] arr, int row, int m) {
        for (int j = 0; j < m / 2; j++) {
            swap(arr, row, j, row, m - 1 - j);
        }
    }
}
