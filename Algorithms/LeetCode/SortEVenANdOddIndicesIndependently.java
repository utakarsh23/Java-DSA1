package LeetCode;

import java.util.Arrays;

public class SortEVenANdOddIndicesIndependently {
    public static void main(String[] args) {

        int[] nums = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }

    static int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];

        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            even[j] = nums[i++];
            odd[k] = nums[i];
            j++; k++;
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int l = 0;
        for (int i = 0; i <= nums.length/2; i+=2) {
            nums[i] = even[l];
            nums[nums.length-1-i] = odd[l];
            l++;
        }
        return nums;
    }
}
