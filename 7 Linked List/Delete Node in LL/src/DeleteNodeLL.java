import java.util.LinkedList;
import java.util.Scanner;

public class DeleteNodeLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }
        int del_node = scanner.nextInt();
        scanner.close();

        DeleteTheNode(ll, n, del_node);

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i) + " ");
        }
    }

    static void DeleteTheNode(LinkedList<Integer> ll,int n,int del_node){
        ll.removeIf(value -> value ==  del_node);
    }
}
