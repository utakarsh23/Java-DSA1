package LeetCode;

import java.util.Arrays;

public class SortEVenANdOddIndicesIndependently {
    public static void main(String[] args) {

        int[] nums = {5,39,33,5,12,27,20,45,14,25,32,33,30,30,9,14,44,15,21};
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }

    static int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];

        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            even[j] = nums[i++];
            odd[k] = nums[i];
            j++; k++;
        }
        Arrays.sort(even);
        Arrays.sort(odd);
//        int[] arr = new int[nums.length];
        int l = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(l >= nums.length) break;
            nums[l] = even[i];
            nums[nums.length-1-l] = odd[i];
            l+=2;
        }
        return nums;
    }



    static int[] sortEvenOdd1(int[] nums) {
        int[] odd=new int[nums.length/2];
        int[] even=new int[(nums.length+1)/2];
        int[] ans=new int[nums.length];

        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even[e++]=nums[i];
            }else{
                odd[o++]=nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        for(int i=0;i<odd.length/2;i++){
            int temp=odd[i];
            odd[i]=odd[(odd.length -1)-i];
            odd[(odd.length -1)-i]=temp;
        }

        e=0;o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=even[e++];
            }else{
                ans[i]=odd[o++];
            }
        }
        return ans;
    }
}
