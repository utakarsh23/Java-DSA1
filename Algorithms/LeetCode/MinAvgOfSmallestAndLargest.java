package LeetCode;

import java.util.Arrays;
import java.util.TreeSet;

public class MinAvgOfSmallestAndLargest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,8,9};
        System.out.println(minimumAverage(nums));
    }
    static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        double[] arr = new double[nums.length/2];
        while (i < nums.length/2) {
            arr[i] = (double) (nums[i] + nums[j])/2;
            i++;
            j--;
        }
        Arrays.sort(arr);
        return arr[0];
    }


    //
    static double minimumAverages(int[] nums) {
    Arrays.sort(nums);
    int i = 0;
    int j = nums.length-1;
    //        double[] arr = new double[nums.length/2];
    TreeSet<Double> set = new TreeSet<>();
        while (i < nums.length/2) {
        set.add((double) (nums[i] + nums[j])/2);
        i++;
        j--;
    }
        return set.getFirst();
}
}
