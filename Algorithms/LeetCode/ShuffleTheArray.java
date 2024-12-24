package LeetCode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr, arr.length/2)));
    }
//    static int[] shuffle(int[] nums, int n) {
//
//    }
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = nums[i];
                arr1[i] = nums[i+ (n)];
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            nums[k] = arr[i];
            nums[k+1] = arr1[i];
            k+=2;
        }
        return nums;
    }
}
