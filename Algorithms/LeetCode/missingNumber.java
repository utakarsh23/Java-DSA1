package LeetCode;
//https://leetcode.com/problems/missing-number/

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 3, 1, 2, 6};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctInd = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctInd]) {
                swap(nums, i, correctInd);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
