package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseStringII {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 9));
    }

    static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i+= 2*k) {
            if(i+k-1 < n) {
                reverse(ch, i, i+k-1);
            } else {
                reverse(ch, i, n-1);
            }
        }
        String ans = new String(ch);
        return ans;
    }

    static void reverse(char[] ch, int i, int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
