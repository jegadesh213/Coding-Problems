import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int number = findTheMissing(arr);

        if(number != -1)
        {
            System.out.println("The number " + number + " is missing!" );
        }
        else{
            System.out.println("Everything is alright!");
        }

    }

    static int findTheMissing(int[] arr)
    {
        int count = 0;

        for(int i=0;i < (arr.length - 1);i++)
        {
            count = arr[i] + 1;
            if(count == arr[i+1]){
                continue;
            }
            else{
                return count;
            }
        }

        return -1;
    }
}
