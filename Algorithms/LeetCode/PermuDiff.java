package LeetCode;

public class PermuDiff {
    public static void main(String[] args) {

    }
    static int findPermutationDifference(String s, String t) {
        int absSum = 0;
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            int cht = t.indexOf(chs);
            absSum += Math.abs(cht - i);
        }
        return absSum;
    }
}
