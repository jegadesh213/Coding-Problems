import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class CountPair {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        LinkedList<Integer> head1 = new LinkedList<>();
        LinkedList<Integer> head2 = new LinkedList<>();
        for(int i=0;i<n;i++){
            head1.add(scanner.nextInt());
        }
        for(int i=0;i<m;i++){
            head2.add(scanner.nextInt());
        }
        int target = scanner.nextInt();
        scanner.close();

        // System.out.println(findTheCountofPair(head1, head2, n, m, target));

        // Efficent way to solve this Problem
        System.out.println(findTheCountofPairEff(head1, head2, n, m, target));
    }

    static int findTheCountofPair(LinkedList<Integer> head1,LinkedList<Integer> head2,int n,int m,
    int target){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(head1.get(i) + head2.get(j) == target){
                    count++;
                }
            }
        }
        return count;
    }

    static int findTheCountofPairEff(LinkedList<Integer> head1,LinkedList<Integer> head2,int n,int m,
    int target){
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : head1){
            set.add(i);
        }

        int count = 0;

        for(int i : head2){
            int complement = target - i;
            if(set.contains(complement)){
                count++;
            }
        }

        return count;
    }
}

