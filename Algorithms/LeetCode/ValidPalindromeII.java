package LeetCode;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "eceec";
        System.out.println(validPalindrome(s));
    }
    static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return palindrome(s, i+1, j) || palindrome(s, i, j-1);
            }
        }
        return true;
    }

    static boolean palindrome(String s, int a, int b) {
        while (a <= b) {
            if(s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

}
