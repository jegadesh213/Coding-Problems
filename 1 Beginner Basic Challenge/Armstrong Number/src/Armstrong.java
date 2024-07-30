import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println(Armstrongfinder(n) ? "Number is Armstrong " : "Number is not an Armstrong");
    }

    static boolean Armstrongfinder(int n){
        int sum = 0;
        int temp = n;
        while(n!=0){
            int res = n % 10;
            sum += (Math.pow(res, 3)); 
            n = n/10;
        }

        return (temp == sum) ? true : false;
    }
}
