import java.util.Scanner;

public class EnhancedMN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(findTheMissingNum(arr,n));
    }

    static int findTheMissingNum(int[] arr,int n)
    {
        int sum = 0;

        for(int i:arr)
        {
            sum += i;
        }

        int expectedSum = (n * (n+1))/2;
        return sum - expectedSum;
    }
}
