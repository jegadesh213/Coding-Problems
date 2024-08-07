import java.util.Scanner;

public class Seive {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.close();

        // This is the method we used Sieve of Eratosthenes to find the prime number upto the N numbers
        primeFinder(n);
    }

    static void primeFinder(int n){
        boolean[] arr = new boolean[n+1];

        for(int i=0;i<n;i++){
            arr[i] = true;
        }

        for(int p=2;p*p<=n;p++){
            if(arr[p] == true){
                for(int i=p*p;i<=n;i+=p){
                    arr[i] = false;  
                }
            }
        }

        for(int i=2;i<n;i++){
            if(arr[i] == true){
                System.out.print(i + " ");
            }
        }

    }
}
