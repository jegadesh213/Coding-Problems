import java.util.LinkedList;
import java.util.Scanner;

public class MiddleLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(middleElement(ll, n));
    }

    static int middleElement(LinkedList<Integer> ll,int n){
        return ll.get(n/2);
    }
}
