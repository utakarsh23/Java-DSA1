package LeetCode;

import java.util.Arrays;

public class DistBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 3}, arr2 = {-4,-3,6,10,20,30};
        int d = 3;
        System.out.println(findTheDistanceValue1(arr1, arr2, d));
    }
    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            int j = 0;
            while(j < arr2.length) {
                if(Math.abs(arr1[i] - arr2[j]) <= d) {
                    count--;
                    break;
                }
                j++;
            }
        }
        return count;
    }

    //

    static int findTheDistanceValue1(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2); // Sort arr2 for binary search
        int count = 0;

        for (int num : arr1) {
            if (isValid(num, arr2, d)) {
                count++;
            }
        }

        return count;
    }

    static boolean isValid(int num, int[] arr2, int d) {
        int idx = Arrays.binarySearch(arr2, num); // Binary search for exact match
        if (idx >= 0) return false; // Exact match found, not a valid distance value

        // Convert `binarySearch` result into the correct insertion point
        idx = -(idx + 1);

        // Check closest neighbors (idx and idx-1)
        if (idx < arr2.length && Math.abs(arr2[idx] - num) <= d) return false;
        if (idx > 0 && Math.abs(arr2[idx - 1] - num) <= d) return false;

        return true;
    }
}
