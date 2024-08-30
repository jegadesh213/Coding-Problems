import java.util.Scanner;

public class bouquets {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(blossomDay(arr, n, m, k));
    }

    static int blossomDay(int[] arr,int n,int m,int k){
        if(m*k >n){
            return -1;
        }
        
        int start = Integer.MIN_VALUE;
        int end = Integer.MAX_VALUE;

        for(int i : arr){
            start = Math.min(start, i);
            end = Math.max(end, i);
        }

        while(start<end){
            int mid = (start+end)/2;
            if(isPossible(arr,n,m,k,mid)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }

        return start;
    }

    static boolean isPossible(int[] arr,int n,int m,int k,int mid){
        int bouquets = 0 , flowers = 0;
        for(int i : arr){

            if(i <= mid){
                flowers++;

                if(flowers == k){
                    bouquets++;
                    flowers = 0;
                }
            }else{
                flowers = 0;
            }
            
            if(bouquets >= m){
                return true;
            }
        }
        return false;
    }
}
