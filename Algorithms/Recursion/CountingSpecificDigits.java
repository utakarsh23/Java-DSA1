package Recursion;

public class CountingSpecificDigits {

    public static void main(String[] args) {
        System.out.println(count(30980096));
    }
    //m1
    static int sum = 0;
    static void digits(int n, int target) {
        if(n== 0) return;
        int rem = n%10;
        if(rem == target) {
            sum++;
        }
        digits(n/10, target);
    }

    //m2
    static int count(int n) {
        return helper(n, 0);
    }

    //special case to return the same value to above function calls;
    private static int helper(int n, int c) {
        if (n == 0) return c;
        int remainder = n % 10;
        if (remainder == 0) return helper(n / 10, c + 1);
        return helper(n / 10, c);
    }
}
