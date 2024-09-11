import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();

        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }

        scanner.close();

        System.out.println(isPalindrome(ll) ? "is Palindrome" : "is not a Palindrome");
    }

    static boolean  isPalindrome(LinkedList<Integer> ll){
        while(ll.size() > 1){
            if(ll.getFirst() == ll.getLast()){
                ll.removeFirst();
                ll.removeLast();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
