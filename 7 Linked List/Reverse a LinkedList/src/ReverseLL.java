import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        LinkedList<Integer> ll = new LinkedList<>();

        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }

        scanner.close();
        reversal(ll, n);
    }

    static void reversal(LinkedList<Integer> ll,int n){
        while (!ll.isEmpty()) {
            System.out.print(ll.getLast() + " ");
            ll.removeLast();
        }
    }
}
