import java.util.HashSet;
import java.util.Scanner;

public class KeyPair {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        scanner.close();

        // Normal Brute Force Method to find the key Pair of the elements in the Array
        // System.out.println(findKeyPairNormal(arr,n,x));

        // Here we can use Two pointer to solve this problem more effectively
        // System.out.println(findKeyPairTwoPointer(arr,n,x));

        // At last here we are using the hashset to find the difference between the elements and search in the Hashset 
        System.out.println(findKeyPairHashSet(arr,n,x));
    }

    static boolean findKeyPairNormal(int[] arr,int n,int x){
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean findKeyPairTwoPointer(int[] arr,int n,int x){
        int start = 0;
        int end = n - 1;

        while(start!=end){
            if(arr[start] + arr[end] == x){
                return true;
            }
            else if(arr[start] + arr[end] < x){
                start++;
            }
            else if(arr[start] + arr[end] > x){
                end--;
            }
        }
        
        return false;
    }

    static boolean findKeyPairHashSet(int[] arr,int n,int x)
    {
        HashSet<Integer> hash = new HashSet<>();

        for(int i : arr){
            int temp = x - i;
            if(hash.contains(temp)){
                return true;
            }
            hash.add(i);
        }

        return false;
    }
}
