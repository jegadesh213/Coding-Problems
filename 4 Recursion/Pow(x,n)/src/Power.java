import java.util.Scanner;

public class Power {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(Pow(n,x));
    }
    static int Pow(int n,int x){
        if(x==0) return 1;
        
        return n*Pow(n, x-1);
    }
}
