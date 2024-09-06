import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        sortInBubble(arr, n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void sortInBubble(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
