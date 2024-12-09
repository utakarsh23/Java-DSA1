//https://leetcode.com/problems/find-in-mountain-array/description/

public class LeetCodeMountainArraySearch {
    public static void main(String[] args) {

    }
    static int peakIndexInMountainArrayss(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start - (start - end) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; //or return end; cause both are same in the end
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArrayss(arr);
        int firstTry = OABS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return OABS(arr, target, peak+1, arr.length-1);
    }
    static int OABS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start - (start - end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
