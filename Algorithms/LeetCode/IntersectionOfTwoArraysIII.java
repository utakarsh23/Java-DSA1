package LeetCode;
/// https://leetcode.com/problems/intersection-of-two-arrays-ii
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysIII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        if(nums1.length > nums2.length) {
            Arrays.sort(nums1);
            for(int x : nums2) {
                if(binarySearch(nums1, x)) {
                    list.add(x);
                }
            }
        } else {
            Arrays.sort(nums2);
            for(int x : nums1) {
                if(binarySearch(nums2, x)) {
                    list.add(x);
                }
            }
        }
        int[] arr = new int[list.size()];
        int i = 0;
        for(int x: list) {
            arr[i] = x;
            i++;
        }
        return arr;
    }

        static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return true;
            }
        }
        return false;
    }

}
