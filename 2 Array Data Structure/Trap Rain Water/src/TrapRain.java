import java.util.Scanner;

public class TrapRain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements of the Array :");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Using Normal Brute Force Method
        // System.out.println(calculateTheTrap(arr, n));

        // Using Stack we can implement the problem solution as
        System.out.println(calculateTheTrapEff(arr, n));
    }

    static int calculateTheTrap(int[] arr,int n){
        int trap =0;
        for(int i=1;i<n-1;i++){

            int left = arr[i];
            for(int j=0;j<i;j++){
                left = Math.max(left,arr[j]);
            }

            int right = arr[i];
            for(int j=i+1;j<n;j++){
                right = Math.max(right, arr[j]);
            }

            trap += Math.min(right, left) - arr[i];
        }

        return trap;
    }

    static int calculateTheTrapEff(int[] arr,int n){
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int left = 0, right = arr.length - 1;
        int left_max = 0, right_max = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= left_max) {
                    left_max = arr[left];  // Update left max
                } else {
                    waterTrapped += left_max - arr[left];  // Water trapped at current left
                }
                left++;  // Move left pointer inward
            } else {
                if (arr[right] >= right_max) {
                    right_max = arr[right];  // Update right max
                } else {
                    waterTrapped += right_max - arr[right];  // Water trapped at current right
                }
                right--;  // Move right pointer inward
            }
        }

        return waterTrapped;
    }
}
