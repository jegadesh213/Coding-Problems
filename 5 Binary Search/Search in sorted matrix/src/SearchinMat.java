import java.util.Arrays;
import java.util.Scanner;

public class SearchinMat {
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

        System.out.println(Arrays.toString(findTheIndexOfTarget(arr, n, m, x)));
    }

    static int[] findTheIndexOfTarget(int[][] arr,int n,int m,int x){
        int res = 0;
        for(int i=0;i<n;i++){
            res = findTheTarget(arr[i], x);
            if(res > -1){
                return new int[] {i , res};
            }
        }
        return new int[] {-1,-1};
    }

    static int findTheTarget(int[] row,int x){
        int start = 0 , end = row.length - 1;
        while(start <= end){
            int mid= (start+end) / 2;
            if(row[mid] == x){
                return mid;
            }
            else if(row[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
