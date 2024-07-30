import java.util.Scanner;

public class PalMet1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(checkPalindrome(n) ? "is a Palindome" : "is not a Palindrome");

    }

    static boolean checkPalindrome(int n){
        String numbString = Integer.toString(n);

        StringBuilder sb = new StringBuilder(numbString);

        String reverseString = sb.reverse().toString();

        return (numbString.equals(reverseString)) ? true : false;
    }
}
