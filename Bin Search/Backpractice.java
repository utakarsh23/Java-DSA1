
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1442881653/
public class Backpractice {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 13, 20, 24, 28, 31 };
        int target = 31;
//        System.out.println(searchRange(arr, target));
        System.out.println(ans(arr, target));
    }

    //------------------------------------------------------------------------------------------
    //First and last of the element
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean firstStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start - (start - end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(firstStartIndex) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
//------------------------------------------------------------------------------------------
//Infinite array Binary Search
    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start +1)*2;
            start = temp;
        }
        return Binarysearch(arr, target, start, end);
    }

    static int Binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start - (start - end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

