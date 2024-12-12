//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println((duplicateNumber(arr)));
    }
    static List<Integer> duplicateNumber(int[] nums) {
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
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                li.add(nums[index]);
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
