package LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums= {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
