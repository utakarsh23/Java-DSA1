package LeetCode;
/// https://leetcode.com/problems/intersection-of-two-arrays-ii
import java.util.Arrays;
import java.util.LinkedList;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        LinkedList<Integer> list = new LinkedList<>();
        int size1 = nums1.length;
        int size2 = nums2.length;
        int i = 0;
        int j = 0;
        while (i < size1 && j < size2) {
            if(nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[list.size()];
        int k = 0;
        for(int x: list) {
            arr[k] = x;
            k++;
        }
        return arr;
    }

}
