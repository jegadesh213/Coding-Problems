import java.util.Scanner;

public class PalMet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String numString = Integer.toString(n);
        System.out.println(findPalindrome(numString) ? "is a Palindrome" : "is not a Palindrome");
    }

    static boolean findPalindrome(String numbString){

        int len = numbString.length();

        for(int i=0;i<len/2;i++){
            if(numbString.charAt(i) != numbString.charAt(len-i-1)){
                return false;
            }
        }

        return true;
    }
}
