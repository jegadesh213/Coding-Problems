import java.util.Scanner;

public class GCDnew {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("The GCD of the numbers " + a + " & " + b + " is : " + find(a,b) );
    }

    public static int find(int a , int b)
    {
        if (a == 0)
            return b;

        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b) {
            if (a % b == 0)
                return b;
            return find(a - b, b);
        }
        if (b % a == 0)
            return a;
        return find(a, b - a);
    }
}
