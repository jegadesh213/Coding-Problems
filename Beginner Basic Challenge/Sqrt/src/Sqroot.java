import java.util.Scanner;

public class Sqroot {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int rt = (int)Math.sqrt(n);
        System.out.println(rt + " is the square root of the number " + n);
    }
}
