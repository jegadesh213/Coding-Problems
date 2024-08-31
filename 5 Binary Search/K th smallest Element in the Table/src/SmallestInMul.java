import java.util.Scanner;

public class SmallestInMul {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(findTheMin(n, m, k));
    }

    static int findTheMin(int n,int m,int k){
        int start = 1;
        int end = n*m;

        while(start < end){
            int mid = (start+end)/2;
            
            if(count(n,m,mid) < k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }

        return start;
    }

    static int count(int n,int m,int mid){
        int count = 0;
        for(int i=1;i<=m;i++){
            count += Math.min(mid/i,n);
        }
        return count;
    }
}
