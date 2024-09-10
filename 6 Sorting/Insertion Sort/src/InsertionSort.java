import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        scanner.close();

        sortInInsertion(arr,n);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void sortInInsertion(int[] arr,int n){
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
