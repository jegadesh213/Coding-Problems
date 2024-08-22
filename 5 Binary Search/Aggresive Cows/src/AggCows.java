import java.util.Arrays;
import java.util.Scanner;

public class AggCows {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        Arrays.sort(arr);
        scanner.close();

        System.out.println(findTheStall(arr, n, k));
    }

    static int findTheStall(int[] arr,int n,int k){
        int result = 0;
        int start = 1 , end = arr[n-1] - arr[0];
        while(start <= end){
            int mid = (start+end)/2;
            if(isPossible(arr,n,k,mid)){
                result = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return result;
    }

    static boolean isPossible(int[] arr,int n,int k,int minDis){
        int count = 1,lastPosition = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] - lastPosition >= minDis){
                count++;
                lastPosition = arr[i];
            }

            if(count == k){
                return true;
            }
        }
        return false;
    }
}
