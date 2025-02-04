package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArratAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        System.out.println(Arrays.toString(pivotArray1(nums, pivot)));
    }
    static int[] pivotArray(int[] nums, int pivot) {
        int i = 0;
        int j = nums.length;
        List<Integer> small = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        List<Integer> same = new ArrayList<>();

        while (i < j) {
            if(nums[i] < pivot) {
                small.add(nums[i]);
            } else if (nums[i] > pivot) {
                bigger.add(nums[i]);
            } else {
                same.add(nums[i]);
            }
            i++;
        }
        int l = 0;
        int m = bigger.size()-1;
        int w = 0;
        int[] arr = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            if(k < small.size()) {
                arr[k] = small.get(l);
                l++;
            }
            if(k < bigger.size()) {
                arr[nums.length - 1 - k] = bigger.get(m);
                m--;
            }
            if(k > small.size()-1 && k < nums.length-bigger.size()) {
                arr[k] = same.get(w);
                w++;
            }
        }
        return arr;
    }



    static int[] pivotArray1(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int i=0;
        int r=nums.length-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<pivot){
                ans[i]=nums[j];
                i++;
            }
            if(nums[nums.length-1-j]>pivot){
                ans[r]=nums[nums.length-1-j];
                r--;
            }
        }
        while(i<=r){
            ans[i++]=pivot;
            ans[r--]=pivot;
        }
        return ans;

    }
}
