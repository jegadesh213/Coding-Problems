import java.util.Scanner;

public class SLS {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       int[] arr = new int[n];

       for(int i=0;i<n;i++)
       {
        arr[i] = scanner.nextInt();
       }

       scanner.close();

       System.out.println("The second largest is " +secondLargest(arr));
       System.out.println("The second smallest is " +secondSmallest(arr));
    }

    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                slargest = largest;
                largest = i;
            } else if (i > slargest && i < largest) {
                slargest = i;
            }
        }

        return slargest;
    }
    static int secondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for(int i : arr)
        {
            if(i < smallest)
            {
                ssmallest = smallest;
                smallest = i;
            }
            else if(i != smallest && i < ssmallest)
            {
                ssmallest = i;
            }
        }

        return ssmallest;
    }
}
