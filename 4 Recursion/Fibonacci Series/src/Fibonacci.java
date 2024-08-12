import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibo(n) + " is the " +  n +"th number of fibonacci series.");
    }
    static int fibo(int n){
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
