import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int LD = scanner.nextInt();

        System.out.println("The Last Digit is : " + (LD % 10));

    }
}
