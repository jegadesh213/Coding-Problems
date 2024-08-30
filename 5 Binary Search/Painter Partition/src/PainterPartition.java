import java.util.Scanner;

public class PainterPartition {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(painterRequired(arr, x));
    }

    static int painterRequired(int[] arr,int x){
        int left = 0;
        int right = 0;
        for(int i : arr){
            left = Math.max(left, i);
            right += i;
        }

        while(left<right){
            int mid = (left+right)/2;
            if(isPossible(arr,x,mid)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        
        return left;
    }

    static boolean isPossible(int[] arr,int x,int mid){
        int painterRequired = 1, time = 0;
        for(int i:arr){
            time += i;
            if(time > mid){
                painterRequired ++;
                time = i;

                if(painterRequired > x){
                    return false;
                }
            }
        }
        return true;
    }
}
