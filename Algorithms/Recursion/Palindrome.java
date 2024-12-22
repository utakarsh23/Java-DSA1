package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "12321";

        System.out.println(panindrom(s, 0, s.length()-1));
    }


    //m1
    static int rev1(int n) {
        int digits = (int)Math.log10(n) + 1;
        return helperFunc(n, digits);
    }

    static int helperFunc(int n, int digits) {
        if(n%10 == n) return n;
        int rem = n%10;
        return rem * (int)Math.pow(10, digits-1) + helperFunc(n/10, digits-1);
    }
    static boolean palindrome(int s){
        if(s == rev1(s)) return true;
        return false;
    }


    //m2
    static boolean palin(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != charAts(s, s.length()-1-i))
                return false;
        }
        return true;
    }
    static char charAts(String s, int index) {
        return s.charAt(index);
    }


    //m3
    static boolean palindr(String s, int start, int end) {
        while (start<= end) {
            if(s.charAt(start) == s.charAt(end)) {
                start+=1;
                end-=1;
            } else {
                return false;
            }
        }
        return true;
    }


    //m4
    static int ss = 0;
    static boolean panindrom(String s, int start, int end) {
        ss++;
        if(ss > s.length()/2) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return panindrom(s, start+1, end-1);
    }
}
