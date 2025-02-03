package LeetCode;

import java.util.Arrays;

public class SortEVenANdOddIndicesIndependently {
    public static void main(String[] args) {

        int[] nums = {5,39,33,5,12,27,20,45,14,25,32,33,30,30,9,14,44,15,21};
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
//        int[] arr = new int[nums.length];
        int l = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(l >= nums.length) break;
            nums[l] = even[i];
            nums[nums.length-1-l] = odd[i];
            l+=2;
        }
        return nums;
    }
}
