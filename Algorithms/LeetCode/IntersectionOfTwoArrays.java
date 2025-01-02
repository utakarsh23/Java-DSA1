package LeetCode;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        for(int num1 : nums1) first.add(num1);
        for(int num2 : nums2) if(first.contains(num2)) second.add(num2);
        int[] ss = new int[second.size()];
        int i = 0;
        for(int x : second) {
            ss[i] = x;
            i++;
        }
        return ss;
    }
//    static boolean binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end) {
//            int mid = start+(end-start)/2;
//            if(arr[mid] > target) {
//                end = mid-1;
//            } else if (arr[mid] < target) {
//                start = mid+1;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
}
