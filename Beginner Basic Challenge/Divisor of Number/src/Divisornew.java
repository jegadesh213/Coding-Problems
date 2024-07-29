import java.util.Scanner;

public class Divisornew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i +  " ");
                }
            }
        }
    }
}
