package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class LargestNumberAtleasttwiceOfOther {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 2};
        System.out.println(dominantIndex1(arr));
    }

    //inefficient
    static int dominantIndex(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        if(arr[arr.length-1] < arr[arr.length-2]*2) {
            return -1;
        }

        int j = 0;
        for(int x: nums){
            if(x == arr[arr.length-1]) {
                break;
            }
            j++;
        }
        return j;
    }

    static int dominantIndex1(int[] nums) {
        int max = 0;
        int mi = 0;

        if(nums.length < 3) {
            if(nums[0] > nums[1]) {
                if(nums[0] < nums[1]*2) {
                    return -1;
                }
            }
        }

        Stack<Integer> st = new Stack<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > max) {
                max = nums[j];
                st.push(nums[j]);
                mi = j;
            }
        }
        st.addFirst(0);
        int maxi = st.pop();
        int maxis = st.pop();
        if(maxis*2 > maxi) {
            return -1;
        }
        return mi;
    }
}
