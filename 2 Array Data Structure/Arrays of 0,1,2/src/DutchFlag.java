import java.util.Scanner;

public class DutchFlag {
    public static void main(String[] args) {
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

        dutchFlagAlgo(arr,n);
    }

    static void dutchFlagAlgo(int[] arr, int n)
    {
        System.out.println("have to continue tomorrow!!");
    }
}
