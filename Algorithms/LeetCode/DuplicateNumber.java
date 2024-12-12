//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package LeetCode;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3};
        System.out.println((duplicateNumber(arr)));
    }
    static int duplicateNumber(int[] nums) {
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
                return nums[index];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
