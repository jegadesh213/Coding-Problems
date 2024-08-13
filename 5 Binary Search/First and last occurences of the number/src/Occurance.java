import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        scanner.close();

        System.out.println(Arrays.toString(find(arr, n, k)));
    }

    static int[] find(int[] arr,int n,int k){
        int firstOcc = firstOccurance(arr, n, k);
        int lastOcc = lastOccurance(arr, n, k);
        
        return new int[]{firstOcc,lastOcc};
    }

    static int firstOccurance(int[] arr,int n,int k){
        int start=0;
        int end = n-1;
        int result = -1;

        while(start<=end){
            int mid = (start+end) / 2;
            if(arr[mid] == k){
                result = mid;
                end = mid-1;
            }
            else if(arr[mid] > k){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }

        }
        return result;
    }

    static int lastOccurance(int[] arr,int n,int k){
        int start=0;
        int end = n-1;
        int result = -1;

        while(start<=end){
            int mid = (start+end) / 2;
            if(arr[mid] == k){
                result = mid;
                start = mid+1;
            }
            else if(arr[mid] > k){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }

        }
        return result;
    }
}
