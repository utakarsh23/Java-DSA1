package LeetCode;
//https://leetcode.com/problems/maximum-score-after-splitting-a-string/
import java.util.ArrayList;
import java.util.List;

public class maxScorea {
    public static void main(String[] args) {
        System.out.println(maxScore("00000"));
    }
    static int maxScore(String s) {
        int size = s.length()-1;
        StringBuffer left = new StringBuffer();
        StringBuffer right = new StringBuffer(s);
        List<Integer> liLeft = new ArrayList<>();
        List<Integer> liRight = new ArrayList<>();

        int countLeft = 0;
        int countTotalOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                countTotalOne++;
            }
        }
        for (int i = 0; i < s.length()-1; i++) {
            left.append(right.charAt(0));
            if(right.charAt(0) == '0') {
                countLeft++;
            } else {
                countTotalOne--;
            }
            liLeft.add(countLeft);
            liRight.add(countTotalOne);
            right.replace(0, 1, "");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < liLeft.size(); i++) {
            if(liLeft.get(i)+liRight.get(i) > max) {
                max = liLeft.get(i)+liRight.get(i);
            }
        }
        return max;
    }
}
