package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findTheDiff {
    public static void main(String[] args) {
        String s = "ae", t = "aea";
        System.out.println(findTheDifference(s, t));
    }
    static char findTheDifference(String s, String t) {
        int i = 0;
        int j = s.length();
        if(t.length() < 2) {
            return t.charAt(0);
        }
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);
        while(i <= j) {
            if(chs[j-1] != cht[j]) {
                return cht[j];
            }
            if(chs[i] != cht[i]) {
                return cht[i];
            }
            i++;
            j--;
        }
        return cht[chs.length];
    }
}
