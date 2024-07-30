import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        
        System.out.println((findPerfect(n) == n) ? "is a Perfect Number" : "is not a Perfect Number");
    }

    static int findPerfect(int n){
        int sum = 0;
        for(int i = 1 ; i < n ; i++)
        {
            if(n%i==0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
