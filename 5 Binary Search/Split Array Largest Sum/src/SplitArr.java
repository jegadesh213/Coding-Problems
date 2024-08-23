import java.util.Scanner;

public class SplitArr {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(splitSum(arr, n, k));
    }

    static int splitSum(int[] arr,int n,int k){
        int start = 1;
        for(int i=0;i<n;i++){
            if(arr[i] > start){
                start = arr[i];
            }
        }
        int end = 0;
        for(int i=0;i<n;i++){
            end += arr[i];
        }
        int ans = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(isPossible(arr,n,k,mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return ans;
    }

    static boolean isPossible(int[] arr,int n,int k,int mid){
        int count=0;
        int sum =0;
        for(int i=0;i<n;i++){
            if(arr[i] > mid){
                return false;
            }
            sum += arr[i];
            if(sum > mid){
                count++;
                sum = arr[i];
            }
        }
        count++;
        if(count<=k){
            return true;
        }
        return false;
    }
}
