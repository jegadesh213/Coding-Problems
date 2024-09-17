import java.util.LinkedList;
import java.util.Scanner;

public class SortTheLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<n;i++){
            ll.add(scanner.nextInt());
        }
        scanner.close();

        sortingLinkedList(ll, n);

        System.out.println(ll);
    }

    static void sortingLinkedList(LinkedList<Integer> ll,int n){
        int count0=0,count1=0,count2=0;

        for(int i : ll){
            if(i == 0){
                count0++;
            }
            if(i == 1){
                count1++;
            }
            if(i == 2){
                count2++;
            }
        }

        ll.clear();

        for(int i=0;i<count0;i++){
            ll.add(0);
        }
        for(int i=0;i<count1;i++){
            ll.add(1);
        }
        for(int i=0;i<count2;i++){
            ll.add(2);
        }

    }
}
