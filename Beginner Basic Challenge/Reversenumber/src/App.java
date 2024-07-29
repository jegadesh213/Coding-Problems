import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        long rev  = reverse(n);
        System.out.println(rev);

    }

    static long reverse(long n){
        long rev = 0;
        long temp;

        while(n!=0){
            temp = (n % 10);
            rev = rev * 10+ temp;
            n=n/10;
        }

        return rev;
    }
}
