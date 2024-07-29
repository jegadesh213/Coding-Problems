import java.util.Scanner;

public class App {

    public static boolean isEven(int n){

        return ((n&1) == 0) ? (true) : (false) ;
        
    } 

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        System.out.println(isEven(n) ? ("Even") : ("Odd"));
    }
    
}
