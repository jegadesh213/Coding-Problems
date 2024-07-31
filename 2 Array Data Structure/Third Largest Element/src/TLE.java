import java.util.Scanner;

public class TLE {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("The 3rd Largest Element in the Array is : " + findThirdLargest(arr));

    }

    static int findThirdLargest(int[] arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for(int i : arr)
        {
            if(i > first)
            {
                third = second;
                second = first;
                first = i;
            }
            else if(i > second && i != first)
            {
                third = second;
                second = i;
            }
            else if(i > third && i != second && i != first){
                third = i;
            }
        }
        
        return third;
    }
}
