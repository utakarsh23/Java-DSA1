package LeetCode;

public class sumOfSquaresOfSpecialElements {
    public static void main(String[] args) {

    }
    public int sumOfSquares(int[] nums) {
        int j = 1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums.length%j == 0) {
                sum = sum+(nums[i]*nums[i]);
            }
            j++;
        }
        return sum;
    }
}
