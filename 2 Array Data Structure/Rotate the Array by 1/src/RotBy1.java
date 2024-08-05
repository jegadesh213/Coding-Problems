import java.util.Scanner;

public class RotBy1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        //normal Method
        // rotate(arr,n);

        //using Two Pointer Approach
        rotateTwoPointer(arr,n);
    }

    static void rotateTwoPointer(int[] arr,int n)
    {
        int i = 0;
        int j = n-1;
        while(i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }

        for(int a : arr)
        {
            System.out.print(a + " ");
        }
    }

    static void rotate(int arr[],int n)
    {
        int last = arr[n-1];

        for(int i=n-1;i>=1;i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        for(int i: arr)
        {
            System.out.print(i + " ");
        }
    }


}
