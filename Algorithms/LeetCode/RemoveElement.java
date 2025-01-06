package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1};

        System.out.println(removeElement(arr, 1));
    }
//    static int removeElement(int[] nums, int val) {
//        int k = 1;
//        int r = 1;
//        for (int i = 0; i <= nums.length-k; i++) {
//            if(nums[i] == val && nums[nums.length-r-1] == val) {
//                swap(nums, i, nums.length-1-r);
//                r++;
//                k++;
//            }
//        }
//        for (int i = 1; i < nums.length-1; i++) {
//            if(nums[i-1] == val) {
//                return i-1;
//            }
//        }
//        return 0;
//    }
//    static void swap(int[] arr, int a, int b) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }


    static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 2) {
                count++;
            }
        }
        int[] arr = new int[nums.length-count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                arr[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        return arr.length;
    }
}
