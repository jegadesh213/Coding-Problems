import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTri {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        // This is the optimal way for finding the pascal triangle value with complexoty of O(N^2)
        // Eg : n=4 --> { [1, 4, 6, 4, 1] }
        // List<Integer> list = findThePascal(n);
        // System.out.println(list);

        // Sincce in this chapter we are dealing with the recursion we can solve this problem using recursion using the below implementation
        List<Integer> list = findThePascalEff(n);
        System.out.println(list);
    }
    
    private static int[][] memo ;

    static List<Integer> findThePascal(int n){
        int[][] pascal = new int[n+1][n+1];

        for(int i=0;i<=n;i++){
            pascal[i][0] = 1;

            for(int j=1;j<=i;j++){
                pascal[i][j] = (pascal[i-1][j-1] + pascal[i-1][j]);
            }
        }

        List<Integer> row = new ArrayList<>();
        for(int i=0;i<=n;i++){
            row.add(pascal[n][i]);
        }

        return row;
    }

    static List<Integer> findThePascalEff(int n){
        memo = new int[n + 1][n + 1];

        List<Integer> row = new ArrayList<>();

        for (int k = 0; k <= n; k++) {
            row.add(computePascal(n, k));
        }

        return row;
    }

    static int computePascal(int n,int k){
        if (k == 0 || k == n) {
            return 1;
        }

        if (memo[n][k] != 0) {
            return memo[n][k];
        }

        memo[n][k] = (computePascal(n - 1, k - 1) + computePascal(n - 1, k));
        return memo[n][k];
    }
}
