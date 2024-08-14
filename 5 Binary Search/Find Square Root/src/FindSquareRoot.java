import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println(findTheRoot(n) + " is the Root of the number " + n);
    }
    static int findTheRoot(int n){
        int start=0,end=n,ans=0;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid <= n/mid){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
