package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        List<Integer> li1 = new ArrayList<>();
        int manEleCon = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            if(!li.contains(nums[i])) {
                li.add(nums[i]);
            }
        }

        for(int x: li) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == x) {
                    count++;
                }
            }
            li1.add(count);
        }
        int max = Integer.MIN_VALUE;
        int c = 0;
        for(int x = 0; x < li.size(); x++) {
            if(li1.get(x) > max) {
                max = li1.get(x);
                c = x;
            }
        }

        return li.get(c);
    }
}
