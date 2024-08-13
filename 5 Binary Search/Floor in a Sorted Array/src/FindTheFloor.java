import java.util.Scanner;

public class FindTheFloor {
    // This Problem is Based on the FloorCeilProblem Which is if the number is give as n we should
    //  find the floor which is (n-1) && find the Ceiling (n+1)
    // Eg : n = 5 --> {floor = 4 , ceiling = 6}

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        scanner.close();

        int[] res = findTheFloorAndCeiling(arr, n, x);
        if (res[0] == -1) {
            System.out.print("No floor found, ");
        } else {
            System.out.print("The Floor is : " + arr[res[0]] + ", ");
        }

        if (res[1] == -1) {
            System.out.println("No ceiling found");
        } else {
            System.out.println("The Ceiling is : " + arr[res[1]]);
        }
    }

    static int findTheFloor(int[] arr, int n, int x) {
        if (n == 0) return -1;

        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < x) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return ans;
    }

    static int findTheCeiling(int[] arr, int n, int x) {
        if (n == 0) return -1;

        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] > x) {
                ans = mid;
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return ans;
    }

    static int[] findTheFloorAndCeiling(int[] arr, int n, int x) {
        int f = findTheFloor(arr, n, x);
        int c = findTheCeiling(arr, n, x);
        return new int[] {f, c};
    }
}
