import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        scanner.close();

        //Using the normal Brute Force we have solve this Problem
        // findTheFourSum(arr,n,x);

        // We can also use Two pointer to solve this problem effectively 
        // For that we can store the upcoming result as a List<List<Integers>>
        List<List<Integer>> resultList = findTheFourSumList(arr, n, x);
        for(List<Integer> i : resultList){
            System.out.println(i.toString());
        }

    }

    static boolean findTheFourSum(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l] == x){
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    static List<List<Integer>> findTheFourSumList(int[] arr,int n,int x){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        // Base Condtion
        if(arr.length < 4 || arr == null){
            return result;
        }

        int length = arr.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i+1]){
                continue;
            }
            
            for(int j=0;j<n-2;j++){
                if(j>0 && arr[j]==arr[j+1]){
                    continue;
                }

                int left = j+1;
                int right = length-1;
                while(left<right){
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum == x){
                        result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));

                        while(left<right && arr[left] == arr[left+1]) left++;
                        while(left<right && arr[right] == arr[right-1]) right --;
                        left++;
                        right--;
                    }
                    else if(sum < x){
                        left ++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
