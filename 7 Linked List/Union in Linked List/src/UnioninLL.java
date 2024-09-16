import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class UnioninLL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        for(int i= 0;i<n;i++){
            ll.add(scanner.nextInt());
        }
        for(int i=0;i<m;i++){
            ll2.add(scanner.nextInt());
        }
        scanner.close();

        findTheUnioninLL(ll, ll2);
    }
    
    static void findTheUnioninLL(LinkedList<Integer> ll,LinkedList<Integer> ll2){
        LinkedList<Integer> combinedList = new LinkedList<>();
        combinedList.addAll(ll);
        combinedList.addAll(ll2);

        // Here we are Converting into HashSet inorder to Make it as a Uniqure element and Remove the Duplicate
        HashSet<Integer> uniqueSet = new HashSet<>(combinedList);

        // And we again Convert the set into Result LinkedList and Display it
        LinkedList<Integer> resultList = new LinkedList<>(uniqueSet);

        for(int i=0;i<resultList.size();i++){
            System.out.print(resultList.get(i) + " ");
        }
    }
}
