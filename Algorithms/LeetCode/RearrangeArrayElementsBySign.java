package LeetCode;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray1(nums)));
    }

    static int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int[] arr = new int[nums.length];
        int a = 0;
        int b = 1;
        while (i <= j) {
            if(nums[i] > 0) {
                arr[a] = nums[i];
                a+=2;
            } else {
                arr[b] = nums[i];
                b+=2;
            }
            i++;
        }
        return arr;
    }




    static int[] rearrangeArray1(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int[] arr = new int[nums.length];
        int a = 0;
        int b = 1;
        int c = arr.length-1;
        int d = arr.length-2;
        while (i < j) {
            if(nums[i] > 0) {
                arr[a] = nums[i];
                a+=2;
            } else {
                arr[b] = nums[i];
                b+=2;
            }
            i++;
            if(nums[j] < 0) {
                arr[c] = nums[j];
                c-=2;
            } else {
                arr[d] = nums[j];
                d-=2;
            }
            j--;
        }
        return arr;
    }





//    static int[] sortArrayByParityII1(int[] A) {
//        int i = 0, j = 1, n = A.length;
//        while (i < n && j < n) {
//            while (i < n && A[i] % 2 == 0) {
//                i += 2;
//            }
//            while (j < n && A[j] % 2 == 1) {
//                j += 2;
//            }
//            if (i < n && j < n) {
//                swap(A, i, j);
//            }
//        }
//        return A;
//    }
}
