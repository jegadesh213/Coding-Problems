import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subs {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array : ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<n;i++)
        {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of the second array : ");
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<m;i++)
        {
            arr2[i] = scanner.nextInt();
        }

        scanner.close();
        // Normal Implementation
        // System.out.println(findIsSubset(arr1,arr2,n,m) ? "Yes" : "No");

        // Using Hashset
        // HashSet will store a integer with a unique Id assigning to it which helps to find whether it is present in the map or not 
        System.out.println(useHashSet(arr1,arr2,n,m) ? "Yes" : "No");
    }

    static boolean findIsSubset(int arr1[],int arr2[],int n,int m)
    {
        for(int i=0;i<m;i++)
        {
            boolean found = false;
            for(int j=0;j<n;j++)
            {
                if(arr2[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }

    static boolean useHashSet(int arr1[],int arr2[],int n,int m){
        Set<Integer> hash = new HashSet<>();
        for(int i : arr1)
        {
            hash.add(i);
        }

        for(int j : arr2)
        {
            if(!hash.contains(j)){
                return false;
            }
        }
        return true;
    }
}
