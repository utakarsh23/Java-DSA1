package Mathematics;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {7, 9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] digits) {
        int[] arr = new int[digits.length+1];

        for (int i = 0; i < digits.length; i++) {
            arr[i] = digits[i];
        }

        int i = 0;
        while (digits[digits.length-1] == 9) {
            if(digits.length-1-i == -1) {
                return arr;
            }
            if (arr[digits.length-1-i] != 9) {
                arr[digits.length - 1 - i] = 1;
                arr[digits.length - i] = 0;
            }
            i++;
        }
        digits[digits.length-1] = digits[digits.length-1]+1;
        return digits;
    }
}
