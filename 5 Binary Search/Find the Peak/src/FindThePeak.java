import java.util.Scanner;

public class FindThePeak {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(peakElement(arr,n));
    }

    static int peakElement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            }
            // If the left neighbor is greater, search the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            }
            // If the right neighbor is greater, search the right half
            else {
                low = mid + 1;
            }
        }

        return -1;  // This line will never be reached due to the problem constraints.
    }
}
