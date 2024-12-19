package Mathematics;
//O(log(n))
public class sqrt {
    public static void main(String[] args) {
        System.out.printf("%.3f", sqrt(40, 3));
    }
    static double sqrt(int a, int p) {
        int start = 0;
        int end = a;
        double root = 0.0;

        while(start <= end) {
            int mid = start+(end-start)/2;
            if(mid * mid == a) {
                return mid;
            }
            if (mid * mid < a) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root <= a) {
                root+=incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
