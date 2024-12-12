package LeetCode;

public class SameElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3, 4, 5, 6, 7, 7};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
