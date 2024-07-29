import java.util.Scanner;

public class GCD {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("The GCD of the numbers " + a + " & " + b + " is : " + find(a,b) );
    }

    static int find(int a , int b)
    {
        int result = (int)Math.pow(a, b);

        while(result > 0){
            if ((a%result==0) && (b%result==0)) {
                break;
            }
            else{
                result--;
            }
        }

        return result;
    }
}
