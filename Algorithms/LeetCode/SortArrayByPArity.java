package LeetCode;

import java.util.Arrays;

public class SortArrayByPArity {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII1(new int[]{4, 5, 3, 8, 7, 9, 6, 2})));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int[] arr = new int[nums.length];
        int k = 0;
        int m = 1;
        int l = nums.length-1;
        while (i <= j) {
            if(nums[i]%2 == 0) {
                arr[k] = nums[i];
                k+=2;
            } else {
                arr[m] = nums[i];
                m+=2;
            }
            i++;
        }
        return arr;
    }
//


    static int[] sortArrayByParityII1(int[] A) {
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(A, i, j);
            }
        }
        return A;
    }


    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
