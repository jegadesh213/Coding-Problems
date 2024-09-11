import java.util.LinkedList;
import java.util.Scanner;

public class SearchinLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        LinkedList<Integer> ll = new LinkedList<Integer>();

        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }

        int target = scanner.nextInt();

        scanner.close();

        System.out.println(searchTarget(ll, target) ? "Found" : "Not found");
    }

    static boolean searchTarget(LinkedList<Integer> ll,int target){
        return ll.contains(target);
    }
}
