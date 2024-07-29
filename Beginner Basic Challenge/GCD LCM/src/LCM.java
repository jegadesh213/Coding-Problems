import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcmFind(a,b));
    }

    static int lcmFind(int a , int b)
    {
        int low = (int)Math.min(a, b);
        int high = (int)Math.max(a, b);

        for(int i=high;;i += high)
        {
            if(i % low == 0){
                return i;
            }
        }
    }
}
