package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ThirdMaxNo {
    public static void main(String[] args) {
     int nums[] = {2,3,3,3,3,3,5,6,7,8,9};
        System.out.println(thirdMax(nums));
    }

    static int thirdMax(int[] nums) {
        int i = 0;
        int max = 0;
        List<Integer> li = new ArrayList<>();
        while(i < nums.length) {
            if(!li.contains(nums[i])) li.add(nums[i]);
            max = Math.max(max, nums[i]);
            i++;
        }
        if(li.size() > 2) return li.get(2);
        return max;
    }
}
