import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.close();

        // Recursion method to print 1 to N (5,4,3,2,1)
        printNto1(n);

        System.out.println();
        // Recursion method to print N to 1 (1,2,3,4,5)
        print1toN(n);
    }

    static void printNto1(int n){
        if(n==0) return;

        System.out.print(n + " ");
        printNto1(n-1);
    }

    static void print1toN(int n){
        if(n==0) return;

        print1toN(n-1);
        System.out.print(n + " ");
    }
}
