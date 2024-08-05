import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        scanner.close();

        //Based on the normal Method by declaring a New array to make count of the Frequencies
        // normalMethod(arr,max);

        // Using Map Method we can create Unique Map to elements and count the Frequencies
        mapMethod(arr,n);

    }

    static void normalMethod(int arr[],int max){
        int freq[] = new int[max + 1];

        for(int i : arr)
        {
            freq[i]++;
        }

        for(int i : freq)
        {
            System.out.print(i + " ");
        }
    }

    static void mapMethod(int arr[],int n){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> key : map.entrySet()){
            System.out.println(key.getKey() + " : " + key.getValue());
        }
    }
}
