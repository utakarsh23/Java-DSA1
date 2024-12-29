package LeetCode;
//https://leetcode.com/problems/sort-array-by-parity/description/
import java.util.Arrays;

public class EvenAndOddArray {
    public static void main(String[] args) {
        int[] arr = {5,7, 8};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = 0;
        for (int x: nums) {
            if((x & 1) != 1) {
                arr[j] = x;
                j++;
            } else {
                arr[nums.length-i-1] = x;
                i++;
            }
        }
        return arr;
    }
}
