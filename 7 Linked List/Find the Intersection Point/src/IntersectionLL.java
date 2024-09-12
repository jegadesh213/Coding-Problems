import java.util.LinkedList;
import java.util.Scanner;

public class IntersectionLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m  = scanner.nextInt();

        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();

        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }

        for(int i=0;i<m;i++){
            ll2.add(scanner.nextInt());
        }

        scanner.close();

        System.out.println(findTheIntersection(ll, ll2, n, m));
    }

    static int findTheIntersection(LinkedList<Integer> ll,LinkedList<Integer> ll2,int n,int m){
        int i = 0 , j = 0;

        if(n > m){
            i = n - m;
        }
        else{
            j = m-n;
        }

        while(i < n && j < m){
            if (ll.get(i).equals(ll2.get(j))) {
                return ll.get(i);
            }
            i++;
            j++;
        }

        return -1;
    }
}
