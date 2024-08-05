import java.util.Scanner;

public class RotateByK {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the value of Array : ");
        for(int i  =0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the no of rotations : ");
        int k = scanner.nextInt();

        scanner.close();

        rotateK(arr,n,k);

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    static void rotateK(int arr[],int n,int k)
    {
        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    static void reverse(int arr[],int start,int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
 


