package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,2,4,2};
        System.out.println(containsDuplicate1(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i :nums) {
            if(set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    static boolean containsDuplicate1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
            if (nums[i] < nums[i - 1]) {
                int t = nums[i];
                for (int j = i - 2; j >= 0; j--) {
                    if (t == nums[j]) {
                        return true;
                    }
                }
                nums[i] = nums[i - 1];
                nums[i - 1] = t;
            }
        }
        return false;
    }
}
