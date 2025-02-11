package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfDigitsOfStringsAfterConversion {
    public static void main(String[] args) {
        System.out.println(getLucky1("leetcode", 2));
//       int[] ch = {'9', '0'};
//        System.out.println(Arrays.toString(ch));
    }

    static public int getLucky(String s, int k) {
//        List<Integer> li = new ArrayList<>();
        int sumint = 0;
        String sum = "";
        while (k > 0) {
            if(!(s.charAt(0) > 47 && s.charAt(0) < 58)) {
                for (int i = 0; i < s.length(); i++) {
                    sum = sum + (s.charAt(i) - '0' - '0');
                }
            }
            for (int i = 0; i < sum.length(); i++) {
                sumint = sumint + Integer.parseInt(String.valueOf(sum.charAt(i)));
            }
            s = sumint+"";
            sum = sumint+"";
            sumint=0;
            k--;
        }
        return Integer.parseInt(sum);
    }

    static int getLucky1(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i)-96;
            sum += n%10;
            n /= 10;
            sum += n;
        }
        k--;
        while (k > 0) {
            int temp = sum;
            sum = 0;
            int rem = temp%10;
            while (temp != 0) {
                sum += rem;
                temp /= 10;
            }
            k--;
        }
        return sum;
    }
}
