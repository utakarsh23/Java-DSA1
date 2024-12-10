//https://leetcode.com/problems/search-insert-position/description/

public class LeetCodePosition {
    public static void main(String[] args) {
        int[] arr  = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(arr, target));

    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] > target) {
                end = mid-1;
            } else if (nums[mid]< target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return end+1;
    }
}
