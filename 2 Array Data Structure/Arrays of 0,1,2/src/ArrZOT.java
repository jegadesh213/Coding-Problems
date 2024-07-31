import java.util.Scanner;

public class ArrZOT {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers 0,1 & 2 :");
        for(int i =0 ; i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        sortArray(arr, n);

    }

    static void sortArray(int[] arr,int n){

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
