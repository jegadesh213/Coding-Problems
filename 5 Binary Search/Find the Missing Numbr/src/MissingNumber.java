import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(findTheMissing(arr));
    }

    static int findTheMissing(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] != mid+1){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return start+1;
    }
}
