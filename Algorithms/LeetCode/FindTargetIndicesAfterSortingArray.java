package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3}; int target = 1;
        System.out.println(targetIndices(nums, target));
    }
    static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int indi = 0;
        ArrayList<Integer> li = new ArrayList<>();
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target > nums[mid]) {
                start = mid+1;
            } else if (target < nums[mid]) {
                end = mid-1;
            } else {
                indi = mid;
                break;
            }
        }
        if(start > end) return new ArrayList<>();
        while (indi > 0 && nums[indi] == nums[indi-1]) {
            indi--;
        }
        while (indi < nums.length && nums[indi] == target) {
            li.add(indi++);
        }
        return li;
    }

    /// m2
    static List<Integer> targetIndices1(int[] nums, int target) {
        int num = 0;
        int tcount = 0;

        for(int ele : nums){
            if(ele == target){
                tcount++;
            }else if(ele < target){
                num++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(tcount>0){
            ans.add(num);
            num++;
            tcount--;
        }
        return ans;
    }
}
