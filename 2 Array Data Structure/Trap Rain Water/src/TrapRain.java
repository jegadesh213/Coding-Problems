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
        System.out.println(calculateTheTrap(arr, n));
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


}
