package LeetCode;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(25));
//        System.out.println(2000000000%6);
    }
    static double sqrt(double x) {
        double low = 0;
        double high = x;
        while(low<=high) {
            double mid = high+(low-high)/2;
            if(mid*mid == x) {
                return mid;
            } else if (mid*mid< x) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        int r = (int)high;
        return high;
    }
    static boolean sqrt1(int n)
    {
        if (n < 2) {
            return false;
        }
        int low = 1, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n) {
                return true;
            }
            else if (mid * mid < n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(high*high == n) {
            return true;
        }
        return false;
    }
}
