import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemDup {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        
        // This method can be used if the array is already being sorted and it is used as a brute force
        // removeDuplicate(arr,n);

        // Efficent approach is we can use HashSet for the Add and Check for Duplicates
        removeDuplicateEff(arr, n);
    }

    static void removeDuplicate(int[] arr,int n){
        Arrays.sort(arr);
        int[] temp = new int[n];

        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n-1];

        for(int i=0;i<j;i++){
            arr[i] = temp[i];
        }

        for(int i=0;i<j;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void removeDuplicateEff(int[] arr,int n){
        Set<Integer> hash = new HashSet<>();

        for(int i =0;i<n;i++){
            hash.add(arr[i]);
        }

        System.out.println(hash.toString());
    }
}
