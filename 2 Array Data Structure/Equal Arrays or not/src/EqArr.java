// import java.util.Arrays;
import java.util.Scanner;

public class EqArr {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            arr2[i] = scanner.nextInt();
        }

        scanner.close();

        // using inBuilt Arrays method we can implement as below
        // System.out.println(Arrays.equals(arr,arr2));

        System.out.println(checkEqual(arr,arr2,n) ? "Arrays are Equal" : "Arrays are not equal");
    }

    static boolean checkEqual(int[] arr,int arr2[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}
