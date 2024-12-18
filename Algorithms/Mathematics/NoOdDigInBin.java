package Mathematics;

public class NoOdDigInBin {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
        //2147395599
        //2147483647
//        System.out.println(Integer.MAX_VALUE);
    }
    static int noOfDig(int num, int base) {
        return  (int)((Math.log(num)/Math.log(base)) +1);
        //Log(num)base(2)+1
    }
    static long mySqrt(long x) {
        long left = 0;
        long right = x;
        while(left<=right) {
            long mid = left+(right-left)/2;
            if(mid*mid == x) return mid;
            if(mid*mid < x) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}
