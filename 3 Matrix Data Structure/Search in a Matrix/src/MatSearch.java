import java.util.Scanner;

public class MatSearch {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the rows and columns : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the Array as " + n +" & " + m + " : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the Target to be Known : ");
        int target = scanner.nextInt();
        scanner.close();

        // This the normal Brute Force method to find the element in an 2D array [O(n * m)]
        // System.out.println(findTheTarget(arr, n, m, target)?"Found!" : "Not Found!");

        // Optimal way to find the search in 2D array but applicable only for Sorted Arrays
        System.out.println(findTheTargetEff(arr, n, m, target)?"Found!" : "Not Found!");

    }

    static boolean findTheTarget(int[][] arr,int n,int m,int target){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean findTheTargetEff(int[][] arr,int n,int m,int target){
        int i=0;
        int j = m-1;
        while(i< n && j>=0){
            if(arr[i][j]==target){
                return true;
            }
            else if(arr[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
