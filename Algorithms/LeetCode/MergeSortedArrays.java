package LeetCode;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums1 = {5, 4, 3, 2, 1};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mindx = m - 1;
        int nindx = n - 1;
        int right = m + n - 1;

        while (nindx >= 0) {
            if (mindx >= 0 && nums1[mindx] > nums2[nindx]) {
                nums1[right] = nums1[mindx];
                mindx--;
            } else {
                nums1[right] = nums2[nindx];
                nindx--;
            }
            right--;
        }
    }
}
