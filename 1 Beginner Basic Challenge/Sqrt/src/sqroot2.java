import java.util.Scanner;

public class sqroot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(floorsqrt(n));
    }

    static int floorsqrt(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int result = 1;
        int i = 1;

        while (result <= n) {
            i++;
            result = i * i;
        }

        return i - 1;

    }
}
