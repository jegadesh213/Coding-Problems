import java.util.Scanner;

public class Recusrion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(power(n,m));
    }

    static int power(int n,int m){

        if(m == 0){
            return 1;
        }
        else if(n == 0){
            return 0;
        }

        return n * power(n, m-1);
    }
}