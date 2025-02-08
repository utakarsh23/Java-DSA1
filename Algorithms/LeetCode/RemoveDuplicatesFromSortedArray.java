package LeetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates1(nums));
    }

    static int removeDuplicates(int[] nums) {
        int i = 1;
        int j = nums.length-1;
        while (i <= j) {
            while (i < j && nums[i] == nums[i-1] && nums[i+1] == nums[i]) {
                nums[i+1] = Integer.MAX_VALUE;
                swap(nums, i+1, i+2);
                j--;
            }
            i++;
        }
        return j+1;
    }


    static void swap(int[] arr, int a, int b) {
        while (b < arr.length) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b++;
        }
    }

    //////////

    static int removeDuplicates1(int[] nums) {
        int i=0;
        for( int n:nums){
            if(i<2 || n!=nums[i-2]){
                nums[i++]=n;
            }
        }
        return i;
    }

}
