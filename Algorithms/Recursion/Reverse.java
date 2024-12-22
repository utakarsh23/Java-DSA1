package Recursion;

public class Reverse {
    public static void main(String[] args) {
        rev(123);
        System.out.println(rev1(134));
    }
    static int sum = 0;
    static void rev(int n) {
        if(n <= 0) return;
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
    }

    static int rev1(int n) {
        int digits = (int)Math.log10(n) + 1;
        return helperFunc(n, digits);
    }

    static int helperFunc(int n, int digits) {
        if(n%10 == n) return n;
        int rem = n%10;
        return rem * (int)Math.pow(10, digits-1) + helperFunc(n/10, digits-1);
    }
}
