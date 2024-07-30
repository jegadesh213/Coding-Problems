import java.util.Scanner;
// import java.math.*;

public class FindPower {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int r = scanner.nextInt();
        
        int powerValue = (int)(Math.pow(n, r));
        System.out.println(powerValue);
    }
}
