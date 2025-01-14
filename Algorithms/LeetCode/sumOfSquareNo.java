package LeetCode;

public class sumOfSquareNo {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(44));
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
        for (int i = 1; i < c; i++) {
            for (int j = i; j < c; j++) {
                if(i*i + j*j == c) return true;
            }
        }
        return false;
    }
}