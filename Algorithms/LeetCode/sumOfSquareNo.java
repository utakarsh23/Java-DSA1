package LeetCode;

public class sumOfSquareNo {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(27));
        
    }
    static boolean judgeSquareSum(int c) {
      for (int div = 2; div * div <= c; div++) {
            if (c % div == 0) {
                int exponentCount = 0;
                while (c % div == 0) {
                    exponentCount++;
                    c /= div;
                }
                if (div % 4 == 3 && exponentCount % 2 != 0) {
                    return false;
                }
            }
        }
        return c % 4 != 3;
    }
    static boolean aa(int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < c; j++) {
                if(i*i + j*j == c) return true;
            }
        }
        return false;
    }
    static boolean binAppr(int c) {
        int j = (int)Math.sqrt(c);
        int k = 0;
        for (int i = 0; i < Math.sqrt(c); i++) {
            if (k*k+j*j > c) {
                j--;
            }
            else {
                k++;
            }
            if(k*k+j*j == c) {
                return true;
            }
        }
        return false;
    }
    static boolean test (int c) {
        for (int a = 0; a < c; a++) {
            if(a*a + (c-a*a) == c) {
                return true;
            }
        }
        return false;
    }
}