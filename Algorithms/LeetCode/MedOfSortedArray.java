package LeetCode;

import java.util.Arrays;

public class MedOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1, arr2));

    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[len1+len2];
        int i = 0;
        for (i = 0; i < len1; i++) {
                arr[i] = nums1[i];
            }
        int k = 0;
        for (int j = i; j < len2+len1; j++) {
            arr[j] = nums2[k];
            k++;
        }
        int mid = arr.length/2;

        Arrays.sort(arr);
        if(arr.length%2 == 0) {
            return (arr[mid]+arr[mid+1])/2;
        }
        return arr[mid];
    }
}
