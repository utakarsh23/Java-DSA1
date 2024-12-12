//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package LeetCode;

public class DuplicateNumber1 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3};
        System.out.println((duplicateNumber(arr)));
    }
    static int duplicateNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctInd = nums[i] - 1;
                if (nums[i] != nums[correctInd]) {
                    swap(nums, i, correctInd);
                } else {
                    return nums[i];
                }
            } else {
                i++;
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
