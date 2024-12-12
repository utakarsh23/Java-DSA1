//https://leetcode.com/problems/set-mismatch/
package LeetCode;

import java.util.Arrays;

public class setMismatchArrayDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(duplicateNumber(arr)));
    }
    static int[] duplicateNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctInd = nums[i]-1;
            if (nums[i] != nums[correctInd]) {
                swap(nums, i, correctInd);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
