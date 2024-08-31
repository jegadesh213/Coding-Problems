import java.util.Scanner;

public class Banana {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(eatingSpeed(arr, n, k));
    }

    static int eatingSpeed(int[] arr,int n,int k){
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i : arr){
            end = Math.max(end, i);
        }

        while(start < end){
            int mid = (start+end)/2;
            if(isPossible(arr,n,k,mid)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }

        return start;
    }

    static boolean isPossible(int[] arr,int n,int k,int mid){
        int hours = 0;
        for(int i : arr){
            hours += (i+mid-1)/mid;
        }
        return hours <= k;
    }
}
