import java.util.Scanner;

public class RowOne {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Brute force approach for this can be Written like this 
        // System.out.println("The index which has less 1 is : "+findTheOne(arr,n,m) );

        // Optimal way for calculating maximum 1 can be Calculated by
        System.out.println("The index which has Max 1 is : "+findTheOneEff(arr,n,m) );
    }

    static int findTheOne(int[][] arr,int n,int m){
        int c=Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j] == 1 ){
                    count++;
                }
            }
            if(count<c){
                c=count;
                index=i;
            }
        }
        return index+1;
    }

    static int findTheOneEff(int[][] arr,int n,int m){
        int row=0,column = m-1;
        int maxRow = 0;
        while(row<n && column >=0){
            if(arr[row][column] == 0){
                row++;
            }
            else{
                maxRow = row;
                column--;
            }
        }
        return maxRow+1;
    }
}
