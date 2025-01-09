package LeetCode;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares1(arr)));
    }
//    static int[] sortedSquares(int[] nums) {
//
//    }
    static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
    static int[] sortedSquares1(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])) {
                res[nums.length-1-i] = nums[start]*nums[start];
                start++;
            } else {
                res[nums.length-1-i] = nums[end]*nums[end];
                end--;
            }
        }
        return res;
    }
}
