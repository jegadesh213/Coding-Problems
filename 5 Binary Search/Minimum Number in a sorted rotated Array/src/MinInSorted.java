import java.util.Scanner;

public class MinInSorted {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(findMin(arr, n));
    }

    public static int findMin(int[] arr, int n) {
        int low = 0, high = n-1;
        while(low < high) {
            int mid = (low + high) / 2;
            if(arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }

}
