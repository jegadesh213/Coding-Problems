import java.util.Scanner;

public class ShipPack{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int days = scanner.nextInt();
        scanner.close();

        System.out.println(packingShip(arr, days));
    }

    static int packingShip(int[] arr,int days){
        int left=0;
        int right = 0;
        for(int e : arr){
            left = Math.max(left,e);
            right += e;
        }

        while(left<right){
            int mid = (left+right)/2;
            if(isPossible(arr,days,mid)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }

        return left;
    }

    static boolean isPossible(int[] arr,int days,int mid){
        int currentLoad = 0 , requiredDays = 1;
        for(int e : arr){
            if(currentLoad + e > mid){
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad+=e;
        }

        return requiredDays<=days;
    }
}
