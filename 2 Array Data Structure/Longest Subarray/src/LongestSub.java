import java.util.HashMap;
import java.util.Scanner;

public class LongestSub {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array of elements : ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Number to be Calculated : ");
        int k = scanner.nextInt();

        scanner.close();

        // Using Brute Force we can solve this problem using
        // System.out.println("The longest subarrray will contain : " + findTheSub(arr,k,n) + " numbers");

        // We can use Hashset make this method more effective
        System.out.println("The longest subarrray will contain : " + findTheSubEff(arr,k,n) + " numbers");
    }

    static int findTheSub(int[] arr,int k,int n){

        int max = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    max = Math.max(max, j-i+1);
                }
            }
        }  

        return max;
    }

    static int findTheSubEff(int[] arr,int k,int n){
        int sum =0;
        int max = 0;
        HashMap<Integer , Integer> hash = new HashMap<>();

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum == k){
                max = i+1;
            }

            if(hash.containsKey(sum-k)){
                max = Math.max(max, i-hash.get(sum - k));
            }

            if(!hash.containsKey(sum)){
                hash.put(sum,i);
            }

        }
        return max;
    }
}
