import java.util.Arrays;
import java.util.Scanner;

public class MaxOneRows {
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

        // This is the normal optimal approach for solving this Problem
        // System.out.println(Arrays.toString(findTheMaxOne(arr, n, m)));

        // In order to solve this using binary search we can do this 
        System.out.println(Arrays.toString(findTheMaxOneEff(arr, n, m)));
    }

    static int[] findTheMaxOne(int[][] arr,int n,int m){
        int rowCount=0,index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(rowCount<count){
                rowCount = count;
                index=i;
            }
        }
        return new int[] {index,rowCount};
    }

    static int[] findTheMaxOneEff(int[][] arr,int n,int m){
        int maxCount = -1 , rowCount = -1;
        for(int i=0;i<n;i++){
            int count = findTheRowCount(arr[i]);
            if(count > maxCount){
                maxCount = count;
                rowCount = i;
            }
        }

        return new int[] {rowCount,maxCount};
    }

    static int findTheRowCount(int[] row) {
        int low = 0;
        int high = row.length - 1;
        int firstOneIndex = row.length; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == 1) {
                firstOneIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return row.length - firstOneIndex;
    }
}
