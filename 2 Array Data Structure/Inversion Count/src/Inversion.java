import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements of the Array : ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // This is the Brute Force Approach for the method which is O(n^2)
        // System.out.println(findInversion(arr,n));

        // Other method can be done using merge sort 
        System.out.println(findInversionUsingMerge(arr,0,n-1));
    }

    static int findInversion(int[] arr,int n){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        return count;
    }

    static int countAndMerge(int arr[], int l, int m, int r) {
      
        // Counts in two subarrays 
        int n1 = m - l + 1, n2 = r - m;

        // Set up two arrays for left
        // and right halves
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = arr[i + l];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        // Initialize inversion count (or 
        // result) and merge two halves
        int res = 0, i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            // No increment in inversion count
            // if left[] has a smaller or equal
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }

        // Merge remaining elements
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

        return res;
    }

    static int findInversionUsingMerge(int arr[], int l, int r) {
        int res = 0;
        if (l < r) {
            int m = (r + l) / 2;

            // Recursively count inversions 
            // in the left and right halves
            res += findInversionUsingMerge(arr, l, m);
            res += findInversionUsingMerge(arr, m + 1, r);

            // Count inversions such that 
            // greater element is in left half
            // and smaller in right half
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }
}
