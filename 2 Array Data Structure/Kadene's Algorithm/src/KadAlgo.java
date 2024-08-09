import java.util.Scanner;

public class KadAlgo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the Elements of the Array : ");
        for(int i=0;i<n;i++){
            arr[i]   = scanner.nextInt();
        }

        scanner.close();

        // Below shown is the Brute force of the kadene's Algo
        // System.out.println("The maximum obtain from the array will be : " + findTheKadene(arr,n));

        // Here is the other method which returns the start and end index of the subarray in the program
        findTheKadenePoint(arr, n);
    }

    static int findTheKadene(int[] arr, int n){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for(int i=0;i<n;i++){
            max_ending_here += arr[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }

    static void findTheKadenePoint(int[] arr,int n){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int start = 0,end=0,s=0;
        for(int i=0;i<n;i++){
            max_ending_here += arr[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
                s = i+1;
            }
        }

        System.out.println("The Maximum subArray Value Will be : " + max_so_far);
        System.out.println("The Elements are : ");
        for(int i = start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
