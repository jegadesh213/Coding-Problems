import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        scanner.close();

        Arrays.sort(arr);

        System.out.println(binarySearch(arr, n, k));
    }

    static int binarySearch(int[] arr,int n,int k){
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == k){
                return 1;
            }
            else if(arr[mid] < k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
