import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int x = scanner.nextInt();
        scanner.close();
        
        // Normal Method for the three sum Method
        // System.out.println(findTheTriplet(arr,n,x));

        // Using two pointer We can solve this method by
        doublePointerTriplet(arr,n,x);

    }

    static int findTheTriplet(int[] arr,int n,int x){
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i] + arr[j] + arr[k] == x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static boolean doublePointerTriplet(int arr[],int n,int x){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l = 0;
            int r = n-1;
            while (l<r) {
                if(arr[i]+arr[l]+arr[r] == x){
                    System.out.println(arr[i] + " " +arr[l] + " "+arr[r]);
                    return true;
                }
                else if(arr[i]+arr[l]+arr[r] < x){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return false;
    }
}
