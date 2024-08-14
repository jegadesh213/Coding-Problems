import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int x  = scanner.nextInt();

        scanner.close();

        System.out.println(findIndex(arr, x));
    }

    static int findIndex(int[] arr,int x){
        int start=0,end=1;
        if(arr[end] <= x){
            start = end;
            end = 2*end;
        }
        return doBinarySearch(arr,start,end,x);
    }

    static int doBinarySearch(int[] arr,int start,int end,int x){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
