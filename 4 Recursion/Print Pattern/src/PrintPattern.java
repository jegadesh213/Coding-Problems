import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.close();

        // n=10 {10 5 0 5 10} , n = 16 {16 11 6 1 -4 1 6 11 16} 
        printPattern(n);
    }

    static void printPattern(int n){
        if(n<=0) {
            System.out.print(n + " ");
            return;
        }
        
        
        System.out.print(n + " ");
        printPattern(n-5);
        System.out.print(n + " ");
    }
}
