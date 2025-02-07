package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class OneSwapStringSame {
    public static void main(String[] args) {
        String s1 = "aa", s2 = "ac";
        System.out.println(areAlmostEqual(s1, s2));
        System.out.println(rev(-9807));
        System.out.println(power(2, 8));
    }

    static boolean areAlmostEqual(String s1, String s2) {
        int err_count = 0;
        List<Integer> chInd = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                err_count++;
                chInd.add(i);
            }
            if (err_count > 2) {
                return false;
            }
        }
        if(err_count == 0) {
            return true;
        }
        if(err_count != 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s2);
        for (int i = 0; i < 1; i++) {
            sb.setCharAt(chInd.get(i), s2.charAt(chInd.get(i+1)));
            sb.setCharAt(chInd.get(i+1), s2.charAt(chInd.get(i)));
        }
        return sb.toString().equals(s1);
    }

    static int rev(int num) {
        int i = 0;
        int ans = 0;
        while (num != 0) {
            int rem = num%10;
            num/=10;
            ans = ans*10+rem;
        }
        return ans;
    }

    static int count = 0;
    static int power(int a, int b) {
        if(b == 1) {
            return a;
        }
        return power(a, b-1)*a;
    }
}
