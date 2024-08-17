import java.util.Scanner;

public class BitonicArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(findElementInBitonic(arr,x));
    }

    public static int findPeak(int[] arr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }

            // If the mid element is part of the increasing sequence
            if (mid > 0 && arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else {
                // If the mid element is part of the decreasing sequence
                high = mid - 1;
            }
        }
        return -1;  // This case shouldn't be reached for a valid bitonic array
    }

    // Standard binary search for increasing sequence
    public static int binarySearchIncreasing(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Binary search for decreasing sequence
    public static int binarySearchDecreasing(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Main function to find the element B in bitonic array A
    public static int findElementInBitonic(int[] arr, int target) {
        int n = arr.length;
        int peak = findPeak(arr, 0, n - 1);

        // First, search in the increasing part
        int result = binarySearchIncreasing(arr, 0, peak, target);
        if (result != -1) {
            return result;
        }

        // If not found, search in the decreasing part
        return binarySearchDecreasing(arr, peak + 1, n - 1, target);
    }
}
