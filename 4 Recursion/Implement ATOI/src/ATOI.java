import java.util.Scanner;

public class ATOI {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        scanner.close();

        // Here ATOI is the Problem where we will be given a String where we should convert it into an 
        // Integer without any Inbuilt function
        //  EG :  { "-123" --> 123 } , {"12a" --> -1}
        // We can use this with the optimal way using
        System.out.println(ATOIopt(str));

        // Since we are Dealing with the recursion we are now gng to solve this problem using recursion 
        // But still above process is the most Optimal way to find the Solution for this ATOI Problem
        System.out.println(ATOIrec(str));
    }

    static int ATOIopt(String str){
        if(str.isEmpty() || str == null){
            return -1;
        }

        int sign = 1;
        int start =0;
        int result =0;

        if(str.charAt(0) == '-'){
            sign = -1;
            start =1;
        }

        for(int i=start;i<str.length();i++){
            char CH = str.charAt(i);

            if(CH < '0' || CH >'9'){
                return -1;
            }

            int val = CH - '0';
            result = result * 10 + val; 
        }

        return result*sign;
    }

    public static int ATOIrec(String s) {
        return stringToIntHelper(s, 0, true);
    }

    private static int stringToIntHelper(String s, int index, boolean isNegative) {
        if (index >= s.length()) {
            return 0;
        }
        char ch = s.charAt(index);

        if (index == 0 && ch == '-') {
            return stringToIntHelper(s, index + 1, true);
        }
        if (ch < '0' || ch > '9') {
            return -1; 
        }

        int digit = ch - '0';
        int nextValue = stringToIntHelper(s, index + 1, isNegative);

        if (nextValue == -1) {
            return -1;
        }

        return isNegative ? -(nextValue * 10 + digit) : nextValue * 10 + digit;
    }
}
