import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched");
        int target = scanner.nextInt();

        System.out.println((findElement(arr , target))?"The number is in the array!!" : "The number is not in the array!");
    }

    static boolean findElement(int[] arr,int target){
        for(int i : arr)
        {
            if(i == target)
            {
                return true;
            }
        }
        return false;
    }
}
