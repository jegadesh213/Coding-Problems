import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fact(n));
    }

    static int fact(int n){
        if(n==1) return 1;

        return n*fact(n-1);
    }
}
