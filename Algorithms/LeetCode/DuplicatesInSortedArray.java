package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {-3, -1, -1}; // Input array
        System.out.println(removeDuplicates1(nums));
//        System.out.println(Arrays.toString(removeDuplicates1(nums)));
    }

    //m1( not accurate)
    static int[] removeDuplicates(int[] nums) {
        int[] hehe = new int[nums.length];
        int k = 1;
        hehe[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
//                i = i+1;
            } else {
            hehe[k] = nums[i];
            k++;
            }
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(hehe[i] > hehe[i-1]) {
                count++;
                nums[i] = hehe[i];
            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }
    //m2
    static int removeDuplicates1(int[] nums) {
        int count = 1;
        for (int i = 1; i <nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

}
