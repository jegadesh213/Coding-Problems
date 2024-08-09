import java.util.Arrays;
import java.util.Scanner;

public class NextPer {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        nextPermutation(arr, n);

        System.out.println("The next permutation will be : "+Arrays.toString(arr));
    }

    static void nextPermutation(int[] arr,int n){
        int i = n-2;
        
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }

        if(i>=0){
            int j=n-1;
            while(arr[j] <= arr[i]){
                j--;
            }
            swap(arr,i,j);
        }

        reverse(arr,i+1,n-1);
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr,int a,int b){
        swap(arr, a, b);
        a++;
        b--;
    }
}
