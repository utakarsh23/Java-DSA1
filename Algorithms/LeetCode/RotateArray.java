package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9}; int k = 3;
        rotate1(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    //with extra space
    static void rotate(int[] nums, int k) {
        int rotateNos = k % nums.length;
        int[] arr = new int[nums.length-rotateNos];
        int[] rot = new int[rotateNos];
        for (int i = 0; i < rotateNos; i++) {
            rot[rot.length-1-i] = nums[nums.length-1-i];
        }
        for (int i = 0; i < nums.length-rotateNos; i++) {
            arr[i] = nums[i];
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i < rotateNos) {
                nums[i] = rot[i];
            } else {
                nums[i] = arr[j++];
            }
        }
    }



    //m2 (in-Place)
    static void reverse(int [] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate1(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}
