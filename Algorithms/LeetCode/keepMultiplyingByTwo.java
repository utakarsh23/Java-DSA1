package LeetCode;

public class keepMultiplyingByTwo {
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
        System.out.println(findFinalValue(arr, 3));
    }
    static int findFinalValue(int[] nums, int original) {
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == original) {
                original *=2;
                i = -1;
            }
        }
        return original;
    }
}
