import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class IntersectionArr {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Size of the Array 1 : ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the Elements of Array 1 : ");
        for(int i=0;i<n;i++){
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the Size of the Array 2 : ");
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the Elements of Array 2 : ");
        for(int i=0;i<m;i++){
            arr2[i] = scanner.nextInt();
        }

        scanner.close();

        // Brute Force Approach for this Method is 
        // intersectionOfTheArrayBrute(arr1, arr2, n, m);

        // We will get this result by using hashset and list
        intersectionOfTheArray(arr1,arr2,n,m);
    }

    static void intersectionOfTheArrayBrute(int[] arr1,int[] arr2,int n,int m){
        List<Integer> intersection = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i] == arr2[j]){
                    intersection.add(arr1[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        System.out.println(intersection.toString());
    }

    static void intersectionOfTheArray(int[] arr1,int arr2[],int n,int m){
        HashSet<Integer> hash = new HashSet<>();

        for(int i : arr1){
            hash.add(i);
        }

        List<Integer> intersection = new ArrayList<>();

        for(int j : arr2){
            if(hash.contains(j)){
                intersection.add(j);

                hash.remove(j);
            }
        }

        System.out.println(intersection.toString());
    }
}
