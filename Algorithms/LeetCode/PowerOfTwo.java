package LeetCode;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(64));
    }

    static boolean isPowerOfTwo(int n) {
        for(int i = 0; i < 31; i++) {
            int p = (int)Math.pow(2, i);
            if(p == n) return true;
        }
        return false;
    }

    //m2

    static boolean isPowerOfTwo1(int n) {

        if(n==0)
            return false;
        while(n%2==0)
        {
            n=n/2;
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
