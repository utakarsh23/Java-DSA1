package LeetCode;

public class SmallestRangeI {
    public static void main(String[] args) {
        int[] nums = {0,10}; int k = 2;
        System.out.println(smallestRangeI(nums, k));
    }

    static int smallestRangeI(int[] A, int K) {
        int mx = A[0], mn = A[0];
        for (int a : A) {
            mx = Math.max(mx, a);
            mn = Math.min(mn, a);
        }
        return Math.max(0, mx - mn - 2 * K);
    }
}
