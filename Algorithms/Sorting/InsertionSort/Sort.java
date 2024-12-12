package Sorting.InsertionSort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arrr = {8, 5, 7, 3, 9};
        insertionSort(arrr);
        System.out.println(Arrays.toString(arrr));
    }

    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
