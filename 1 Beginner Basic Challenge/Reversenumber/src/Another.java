import java.util.Scanner;

public class Another {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(reverseNumber(n));
    }

    static int reverseNumber(int n)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();

        return Integer.parseInt(sb.toString());
    }
}
