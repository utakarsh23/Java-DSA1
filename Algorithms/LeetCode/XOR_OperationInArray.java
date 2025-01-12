package LeetCode;

public class XOR_OperationInArray {
    public static void main(String[] args) {
        System.out.println(xorOperation(6, 2));
    }
    static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int c = start;
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            if(i>0) {
                c = c ^ nums[i];
            }
        }
        return c;
    }
}
