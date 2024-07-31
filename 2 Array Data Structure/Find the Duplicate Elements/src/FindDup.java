import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDup {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        findTheDup(arr);
    }

    static void findTheDup(int[] arr){
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for(int i : arr){
            if(!a.add(i)){
                b.add(i);
            }
        }

        if(b.isEmpty()){
            System.out.println("No Repeat is Found");
        }
        else{
            System.out.println("The Repeats are : " + b.toString());
        }
    }
}
