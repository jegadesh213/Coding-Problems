import java.util.LinkedList;
import java.util.Scanner;

public class InsertinMiddleLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }
        int x = scanner.nextInt();
        scanner.close();

        insertMiddleElement(ll, n, x);

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i) + " ");
        }
    }

    static void insertMiddleElement(LinkedList<Integer> ll,int n,int x){
        // This will not delete the Next element from the middle 
        ll.add((n/2)+1 , x);
    }
}
