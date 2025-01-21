package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class XOR {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        System.out.println(duplicateNumbersXOR(nums));
    }

    static int duplicateNumbersXOR(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int j = 0;
        int count = 0;
        for(int x: nums) {
            if(li.contains(x)) {
                count ^= x;
            }
            li.add(x);
            j++;
        }
        return count;
    }
}
