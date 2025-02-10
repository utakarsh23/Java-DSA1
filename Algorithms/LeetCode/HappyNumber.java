package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy1(19));
    }
    static boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();
        while (n != 1 && !map.contains(n)) {
            map.add(n);
            int ss = powered(n, 0);
            n = ss;
        }
        return n == 1;
    }
    static int powered(int n, int t) {
        if(n == 0) return t;
        while (n > 0) {
            int s = 0;
            s = n % 10;
            t = (int) Math.pow(s, 2) + t;
            return powered(n / 10, t);
        }
        return t;
    }


    //method 2
    static boolean isHappy1(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        if(slow == 1) return true;
        return false;
    }

    static int findSquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n%10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}
