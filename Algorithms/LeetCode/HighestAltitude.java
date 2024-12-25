package LeetCode;
//https://leetcode.com/problems/find-the-highest-altitude/description/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {1, 1, 1, 1, 1, 1};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int[] hehe = new int[gain.length+1];
        hehe[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            hehe[i+1] = hehe[i] + gain[i];
        }
        int max = 0;
        for (int i = 0; i < hehe.length; i++) {
            if(hehe[i] > max) {
                max = hehe[i];
            }
        }
        return max;
    }
}
