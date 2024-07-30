import java.util.Arrays;
import java.util.Scanner;

public class LAS {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println("The maximum number is : " + arr[n-1]);
        System.out.println("The minimum number is : " + arr[0]);

    }
}
