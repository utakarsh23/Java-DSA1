package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,2, 3, 4, 4, 3, 5, 5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        List<Integer> li = new ArrayList<>();
        if(nums.length < 2) {
            li.add(nums[0]);
        }
        if(nums[nums.length-1] != nums[nums.length-2]) {
            li.add(nums[nums.length-1]);
        }
        if(nums[1] != nums[0]) {
            li.add(nums[0]);
        }
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i] > nums[i-1] && nums[i] < nums[i+1]) {
                li.add(nums[i]);
            }
        }
        int j = 0;
        for (int i : li) {
            arr[j] = i;
            j++;
        }
        return arr;
    }


}
