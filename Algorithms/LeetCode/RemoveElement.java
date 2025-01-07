package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(arr, 2));
    }
    //m1-- DNW
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



    //m2-- DNW
//    static int removeElement(int[] nums, int val) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 2) {
//                count++;
//            }
//        }
//        int[] arr = new int[nums.length-count];
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != val) {
//                arr[j] = nums[i];
//                j++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            nums[i] = arr[i];
//        }
//        return arr.length;
//    }

    //m3-- DNW
//    static int removeElement(int[] nums, int val) {
//        Arrays.sort(nums);
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == val) {
//                count++;
//            }
//        }
//        int k = 0;
//        int l = 0;
//        while (k < count) {
//                while (nums[nums.length - 1 - l] == val) {
//                    l++;
//            }
//            if(binarySearch(nums, val, nums.length-1-l) != -1) {
//                swap(nums, binarySearch(nums, val, nums.length - 1 - l), nums.length - 1 - l);
//                l++;
//            }
//            k++;
//        }
//        return nums.length-count;
//    }
//    static int binarySearch(int[] arr, int target, int end) {
//        int start = 0;
//        while (start<=end) {
//            int mid = start+(end-start)/2;
//            if(arr[mid] > target) {
//                end = mid -1;
//            } else if (arr[mid] < target) {
//                start = mid +1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//    static void swap(int[] arr, int a, int b) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }



    //m4--
//    static int removeElement(int[] nums, int val) {
//        Arrays.sort(nums);
//
//    }
//
//    static int[] searchRange(int[] nums, int target) {
//        int[] ans = {-1, -1};
//        int start = search(nums, target, true);
//        int end = search(nums, target, false);
//        ans[0] = start;
//        ans[1] = end;
//        return ans;
//    }
//
//    static int search(int[] nums, int target, boolean isStartIndex) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//            int mid = start - (start - end) / 2;
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]){
//                start = mid + 1;
//            } else {
//                ans = mid;
//                if(isStartIndex) {
//                    end = mid-1;
//                } else {
//                    start = mid+1;
//                }
//            }
//        }
//        return ans;
//    }

    static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
