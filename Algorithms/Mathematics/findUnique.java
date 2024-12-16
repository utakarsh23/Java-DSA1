package Mathematics;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 6, 7, 3, 2, 5, 4};
        System.out.println(uniqueXOR(arr));
    }
    static int uniqueXOR(int[] arr) {
        int uniqueNo = 0;
        for(int x: arr) {
            uniqueNo = uniqueNo^x;
        }
        return uniqueNo;
        //xor of number itself is 0(it's like subtracting itself) and xor of zero is 1(new number)
        //2^3^5^4^5^2^3 = 4( as 2^2^3^3^5^5^4 is same as 2^3^5^4^5^2^3, so ^'ing itself will give zero and 0^remaining = remaining)
        /*working of ^
        6^3, 6^6
        (6)base10  == (110)base2 and (3)base10  == (11)base2, now 6 ^'ing them,
          110
          011
        --101---
        (101)base2 == (3)base10
        //////
        (6)base10  == (110)base2, now 6 ^'ing them,
          110
          110
        --000---
        (000)base2 == (0)base10 */
    }
}
