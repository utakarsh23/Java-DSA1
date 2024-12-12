//https://leetcode.com/problems/maximum-gap/description/?envType=problem-list-v2&envId=sorting

//visit again, the solu'n is not correct
package LeetCode;

public class MaxGapInArray {
    public static void main(String[] args) {
        int[] arr = {1,10000000};
        System.out.println(sorting(arr));
    }

    static int sorting(int[] nums) {

        if(nums.length<2) {
            return 0;
        }

        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i]-nums[i-1];
            if(diff > max) {
                max = diff;
            }
        }
        return max;
    }

    static int maximumGap(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i]-nums[i-1];
            if(diff > max) {
                max = diff;
            }
        }
        return max;
    }
}
