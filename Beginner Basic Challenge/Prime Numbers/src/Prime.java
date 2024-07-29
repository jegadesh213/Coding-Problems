import java.util.Scanner;

public class Prime {
    static int i = 2;

    public static boolean isPrime(int n)
    {

        if (n == 0 || n == 1) {
            return false;
        }

        if (n == i)
            return true;

        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrime(n);
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("is a Prime Number");
        }
        else {
            System.out.println("is not a Prime Number");
        }
    }
}
