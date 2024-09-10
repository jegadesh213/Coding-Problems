import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        sortInMerge(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void sortInMerge(int[] arr){
        int length = arr.length ;
        if(length <= 1) return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length -  middle];

        int i = 0;
        int j = 0;

        for(;i<length;i++){
            if(i<middle){
                leftArray[i] = arr[i];
            }
            else{
                rightArray[j] = arr[i];
                j++;
            }
        }
        sortInMerge(leftArray);
        sortInMerge(rightArray);
        merge(leftArray,rightArray,arr);
    }

    static void merge(int[] leftArray,int[] rightArray,int[] arr){
        int leftSize = arr.length /2 ;
        int rightSize = arr.length - leftSize;
        int l=0,r=0,i=0;

        while(l<leftSize && r<rightSize){
            if(leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize){
            arr[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize){
            arr[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
