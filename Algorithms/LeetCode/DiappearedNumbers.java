//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class DiappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 3, 2, 1, 9 ,6, 5};
        System.out.println((missingNumber(arr)));
    }
    static List<Integer> missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctInd = nums[i]-1;
            if (nums[i] != nums[correctInd]) {
                swap(nums, i, correctInd);
            } else {
                i++;
            }
        }
        List<Integer> li = new ArrayList<>();
        for (int index = 1; index <= nums.length; index++) {
            if (nums[index-1] != index) {
                li.add(index);
            }
        }
        return li;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
