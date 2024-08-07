import java.util.Scanner;

public class Kth {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array 1 : ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the Elements of the Array 1 : ");
        for(int i =0;i<n;i++){
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the Size of the Array 2 : ");
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the Elements of the Array 2 : ");
        for(int i =0;i<m;i++){
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Enter the index u need to find : ");
        int k = scanner.nextInt();

        scanner.close();

        // Brute Force Method to find kth element
        kthElement(arr1, arr2, n, m,k);
    }

    static void kthElement(int[] arr1,int[] arr2,int n,int m,int k){
        int[] sorted = new int[n+m];

        int i=0,j=0,d=0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                sorted[d++] = arr1[i++];
            }
            else{
                sorted[d++] = arr2[i++];
            }
        }

        while(i < n){
            sorted[d++] = arr1[i++];
        }

        while(j<m){
            sorted[d++] = arr2[j++];
        }

        System.out.println(sorted[k-1]);
    }

    
}
