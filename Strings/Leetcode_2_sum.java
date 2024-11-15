//45ms
//https://leetcode.com/problems/two-sum/
import java.util.Arrays;
public class Leetcode_2_sum {
    public static void main(String[] args) {
    int[] nums = new int[] {3,2,4};
    int target = 5;
    System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++) {
        for(int j = i+1; j<nums.length; j++) {
            if(nums[i] + nums[j] == target ) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
//118ms
// import java.util.Arrays;
// public class Solution {
//     public static void main(String[] args) {
//     int[] nums = new int[] {3,2,4};
//     int target = 5;
//     System.out.println(Arrays.toString(twoSum(nums, target)));
//     }
//     static int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i< nums.length; i++) {
//         for(int j = 0; j<nums.length; j++) {
//             if(i != j && nums[i] + nums[j] == target ) {
//                 if(i<j) {
//                     return new int[] {i, j};
//                     }
//                 if(i>j) {
//                     return new int[] {j, i};
//                 }
//                 }
//             }
//         }
//         return new int[] {-1, -1};
//     }
// }
//---------------------------------------------------
//119ms
// import java.util.Arrays;
// public class Solution {
//     public static void main(String[] args) {
//     int[] nums = new int[] {3,2,4};
//     int target = 5;
//     System.out.println(Arrays.toString(twoSum(nums, target)));
//     }
//     static int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i< nums.length; i++) {
//         for(int j = 0; j<nums.length; j++) {
//             if(i != j && nums[i] + nums[j] == target ) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[] {-1, -1};
//     }
// }
