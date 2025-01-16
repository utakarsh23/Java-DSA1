package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BitwiseXOR {
    public static void main(String[] args) {
        int nums1[] = {2, 1, 3}, nums2[] = {10,2,5,0};
        System.out.println(xorAllNumss(nums1, nums2));
    }
    //m1
    static int xorAllNums(int[] nums1, int[] nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                sum ^= (nums1[i]^nums2[j]);
            }
        }
    return sum;
    }

    static int xorAllNumss(int[] nums1, int[] nums2) {
        int xa = 0;
        int xb = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        if((len1 & 1) == 1) {
            for(int a: nums2){
                xa = xa^a;
            }
        }
        if((len2 & 1) == 1) {
            for(int a: nums1){
                xb = xb^a;
            }
        }
        return xa^xb;
    }

}
