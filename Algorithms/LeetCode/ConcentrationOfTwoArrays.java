package LeetCode;

import java.util.Arrays;

public class ConcentrationOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int k = 0;
        for(int i = 0; i < 2*n; i++) {
            if(i < n) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[k];
                k++;
            }
        }
        return arr;
    }
}
