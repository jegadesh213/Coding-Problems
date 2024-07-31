import java.util.Scanner;

public class LAS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("The Max number is :" + findMax(arr));
        System.out.println("The Min number is :" + FindMin(arr));

    }

    static int FindMin(int[] arr){
        int min = arr[0];

        for(int i : arr)
        {
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    
    static int findMax(int[] arr){
        int max = 0;
        for(int i : arr)
        {
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}
