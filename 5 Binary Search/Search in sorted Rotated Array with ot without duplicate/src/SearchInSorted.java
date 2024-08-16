import java.util.Scanner;

public class SearchInSorted {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        scanner.close();

        // This method is for searching an element without duplicate in an rotated sorted Array
        // System.out.println(searchWithoutDup(arr, n, x));

        // This method is for searching an element with duplicate in a rotated sorted Array
        System.out.println(searchWithDup(arr, n, x));
    }

    static int searchWithoutDup(int[] arr,int n,int x){
        int left=0,right=n-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid]==x){
                return mid;
            }

            if(arr[left]<=arr[mid]){
                if(arr[left]<=x && x<arr[mid]){
                    right=mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(arr[mid] < x && x <= arr[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }

        return -1;
    }

    static int searchWithDup(int[] arr,int n,int x){
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == x) {
                return mid; 
            }
            

            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
            } else if (arr[left] <= arr[mid]) {
               
                if (arr[left] <= x && x < arr[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            } else {
                if (arr[mid] < x && x <= arr[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
        }
        
        return -1;
    }
}
