import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class UnionArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array 1 : ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter the Elements of array 1 : ");
        for(int i=0;i<n;i++){
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of array 2 : ");
        int m = scanner.nextInt();

        int[] arr2 = new int[m];
        System.out.println("Enter the Elements of array 2 : ");
        for(int i=0;i<m;i++){
            arr2[i] = scanner.nextInt();
        }
        scanner.close();

        // Basic Operation using the HashSet
        // makeUnion(arr1, arr2, n, m);

        // Some what efficent code  can be done by find the minimum amoung the two and add accordingly
        makeUnionEff(arr1,arr2,n,m);

    }

    static void makeUnion(int[] arr1,int[] arr2,int n, int m){
        HashSet<Integer> hash = new HashSet<>();

        for(int i : arr1){
            hash.add(i);
        }

        for(int j : arr2){
            hash.add(j);
        }

        System.out.println("The Elements after the union operations are : ");
        System.out.println(hash.toString());
    }

    static void makeUnionEff(int[] arr1,int[] arr2,int n,int m){
        int min = (n<m) ? n : m;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<min;i++){
            set.add(arr1[i]);
            set.add(arr2[i]);
        }

        if(min == n){
            for(int i=0;i<m;i++)
            {
                set.add(arr2[i]);
            }
        }
        else if(min == m){
            for(int i=0;i<n;i++)
            {
                set.add(arr1[i]);
            }
        }

        System.out.println("The Elements after the union operations are : ");
        System.out.println(set.toString());
    }

    
}
