package BinarySearch;//https://leetcode.com/problems/reverse-integer/description/

public class LeetCodeReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
        System.out.println(reverses(-2147483412));
    }
    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;

            if((rev > Integer.MAX_VALUE/10) /*|| (rev == Integer.MAX_VALUE/10 && rem > 7)*/){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10) {
                return 0;
            }
            rev = rev * 10 + rem;
        }

        return rev;
    }
    static int reverses(Integer x) {
        int rev = 0;

        while (x != 0) {
            int rem = x % 10;
            x = x / 10;

            // Check for overflow before multiplying and adding
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Overflow for negative numbers
            }

            rev = rev * 10 + rem;
        }

        return rev;
    }
}
