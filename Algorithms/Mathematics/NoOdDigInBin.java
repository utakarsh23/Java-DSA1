package Mathematics;

public class NoOdDigInBin {
    public static void main(String[] args) {
        System.out.println(mySqrt(-25));
    }
    static int noOfDig(int num, int base) {
        return  (int)((Math.log(num)/Math.log(base)) +1);
        //Log(num)base(2)+1
    }
    static int mySqrt(int x) {
        int left = 0;
        int right = x;
        while(left<=right) {
            int mid = left+(right-left)/2;
            if(mid*mid == x) return mid;
            if(mid*mid < x) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return right;
    }
}
