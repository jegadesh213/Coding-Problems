import java.util.Scanner;

public class MaxProArr {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        scanner.close();

        // Brute Force approach of the Problem will be this
        // System.out.println(findTheMaxProArr(arr,n));

        // We can solve this method using a two pointer approach 
        System.out.println(findTheMaxProArrEff(arr, n));
    }

    static int findTheMaxProArr(int[] arr,int n){
        int result = arr[0];
        for(int i=0;i<n;i++){
            int mul = arr[i];
            for(int j=i+1;j<n;j++){
                result = Math.max(result,mul);
                mul *= arr[j];
            }

            result = Math.max(result, mul);
        }
        return result;
    }

    static int findTheMaxProArrEff(int[] arr,int n){
        int ans = Integer.MIN_VALUE;
        int L2R = 1;
        int R2L = 1;

        for(int i=0;i<n;i++){
            if(L2R == 0) L2R = 1;
            if(R2L == 0) R2L = 1;

            L2R *= arr[i];
            R2L *= arr[(n-1)-i];

            ans = Math.max(Math.max(L2R, R2L), ans);
        }

        return ans;
    }
}
