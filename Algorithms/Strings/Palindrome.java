package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "appa";
        System.out.println(palindrome2(s));
    }
    static boolean palindrome(String s) { //here this method is useful but it takes O(N^2) Complexity as the new object is created again n again
        String x = "";
        for (int i = s.length()-1; i >= 0; i--) {
            x = x+s.charAt(i); //x = a, x = ab, a = aba, x = abba || hence more memory is being used
        }
        if(x.equals(s)) {
            return true;
        }
        return false;
    }
    static boolean palindrome1(String s) { //here it takes less memory as it does not create n number of object, but a new object(StringBuilder) is created
        String x = "";
        StringBuilder w = new StringBuilder(x);
        for (int i = s.length()-1; i >= 0; i--) {
            w.append(s.charAt(i));
        }
        if(s.equals(w.toString())) {
            return true;
        }
        return false;
    }

    static boolean palindrome2(String s) {

        if(s == null || s.length() == 0) {
            return true;
        }

        for (int i = 0; i <= s.length()/2; i++){ //O(n) time complexity
            int start = s.charAt(i);
            int end = s.charAt(s.length()-1-i);
            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
