package LeetCode;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2) {
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }
        if(nums[1] != nums[0]) {
            return nums[0];
        }
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i] > nums[i-1] && nums[i] < nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }

    //m2
    static int singleNumber1(int[] nums) {
        int num = 0;
        for (int i : nums) {
            num ^= i;
        }
        return num;
    }
}
