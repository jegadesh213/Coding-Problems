import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
