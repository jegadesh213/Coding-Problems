import java.util.Scanner;

public class ArrZot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers 0,1 & 2 :");
        for(int i =0 ; i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        effSortArray(arr,n);

        for(int i : arr)
        {
            System.out.println(i + " ");
        }
    }
    
    static int[] effSortArray(int[] arr,int n){
        int a=0,b=0,c=0;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                a +=1;
            }
            else if(arr[i] == 1)
            {
                b +=1;
            }
            else{
                c +=1;
            }
        }

        int index = 0;

        for(int i=0;i<a;i++)
        {
            arr[index++] = 0;
        }

        for(int i=0;i<b;i++)
        {
            arr[index++] = 1;
        }

        for(int i=0;i<c;i++)
        {
            arr[index++] = 2;
        }

        return arr;

    }
}
