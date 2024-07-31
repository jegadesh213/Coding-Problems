import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println((findSorted(arr))?"Array is Sorted":"Array is not Sorted");
    }

    static boolean findSorted(int[] arr)
    {
        for(int i=1;i<(arr.length - 1);i++){
            if(arr[i] >= arr[i-1])
            {
                
            }
            else{
                return false;
            }
        }
        return true;
    }
}
