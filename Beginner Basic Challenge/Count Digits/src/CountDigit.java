import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();

        int count = noOfDigits(n);

        System.out.println(count);
    }

    static int noOfDigits(long n){
        return ((n/10 == 0) ? 1 : (1+noOfDigits(n/10)));
    }
}
