import java.util.Scanner;

public class MajEle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of an Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements of the Array :");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // This is the Brute Force method for the majority element to be found in an array
        // System.out.println("The majority Element in the Array is : "+ findTheMaj(arr, n));

        // We can Solve this Problem also using the order(n) by Moore's Voting Algo by selecting the candidate
        System.out.println("The majority Element in the Array is : "+ findTheMajEff(arr));
    }

    //  Below method is to find fort Brute 
    static int findTheMaj(int[] arr,int n){
        int maxCount=0,index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count>maxCount){
                maxCount = count;
                index = i;
            }
        }

        return arr[index];
    }

    // Below one are for O(n) Method
    static int findTheMajEff(int[] arr) //------------------------- (1)
    {
        int candidate = findCandidate(arr);

        if(isMaj(arr,candidate)){
            return candidate;
        }

        return 0;
    }

    static int findCandidate(int[] arr)//------------------------- (2)
    {
        int candidate = 0 ;
        int count=0;
        for(int i: arr){
           if(count==0){
                candidate = i;
           }
           count += (i == candidate) ? 1:-1;
        }
        return candidate;
    }

    static boolean isMaj(int[] arr,int candidate)//------------------------- (3)
    {
        int count=0;

        for(int i : arr){
            if(i == candidate){
                count++;
            }
        }

        return (count > arr.length/2);
    }

}
