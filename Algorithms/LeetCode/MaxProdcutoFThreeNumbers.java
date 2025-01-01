package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProdcutoFThreeNumbers {
    public static void main(String[] args) {
        int[] aee = {3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(aee);
        System.out.println(Arrays.toString(aee));
        System.out.println(maximumProduct1(aee));
    }

    //brute force----
    static int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]*nums[j]*nums[k] > max) {
                        max = nums[i]*nums[j]*nums[k];
                    }
                }
            }//1000000000-2147483647
        }
        return max;
    }

    // efficient O(n log(n))
    static int maximumProduct1(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                nums[0] * nums[1] * nums[n - 1]);
    }
}
