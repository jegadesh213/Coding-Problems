import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        scanner.close();

        reverseTheLL(ll, n, k);
        System.out.println(ll);
    }

    static LinkedList<Integer> reverseTheLL(LinkedList<Integer> ll,int n,int k){
        LinkedList<Integer> result = new LinkedList<>();

        for(int i=0;i<n;i+=k){
            List<Integer> sl = ll.subList(i, Math.min(i+k, n));

            Collections.reverse(sl);

            result.addAll(sl);
        }

        return result;
    }
}
