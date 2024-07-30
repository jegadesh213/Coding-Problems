import java.util.Scanner;

public class LCMnew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("The LCM of the numbers "+ a +" & "+ b +" is : "+lcmFind(a,b));
    }

    static int lcmFind(int a , int b)
    {
        int prod = a * b;
        int GCD = GCDnew.find(a, b);
        return (prod / GCD);
    }
}
