import java.util.Scanner;

public class RowCol {
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
        int x = scanner.nextInt();
        scanner.close();

        // This is using Binary Search Algorithm
        // System.out.println(findTheTarget(arr, n, x) == 1 ? "Element Found" : "Element not Found");

        // The efficent way of solving this problem is using the Stair Case Algorithm
        System.out.println(stairCaseMethod(arr, n, m, x) == 1 ? "Element Found" : "Element not Found");
    }

    static int findTheTarget(int[][] arr,int n,int x){
        for (int i = 0; i < n; i++) {
            if (binarySearchRow(arr[i], x) == 1) {
                return 1; 
            }
        }
        return 0; 
    }

    static int binarySearchRow(int[] row,int x){
        int start = 0 , end = row.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(row[mid] == x){
                return 1;
            }
            else if(row[mid]<x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return 0;
    }

    static int stairCaseMethod(int[][] arr,int n,int m,int x){
        int i = 0, j = m - 1;
    
        while (i < n && j >= 0) {
            if (arr[i][j] == x) {
                return 1; 
            } else if (arr[i][j] > x) {
                j--; 
            } else {
                i++; 
            }
        }
        
        return 0; 
    }
}
