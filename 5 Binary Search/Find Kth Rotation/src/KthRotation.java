import java.util.Scanner;

public class KthRotation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(findTheRotation(arr, n));
    }

    static int findTheRotation(int[] arr,int n){
        int start = 0, end = n - 1;

        while (start <= end) {
            if (arr[start] <= arr[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
