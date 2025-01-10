package LeetCode;

import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(2));
    }
    static boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int j = 2; j < Math.sqrt(num); j++) {
            if(num % j == 0) {
                sum = sum + j;
                if(j != num/j) {
                    sum = sum+num/j;
                }
            }
        }
        return sum == num;
//        int sum = 0;
//        int i = 1;
//        while(i < num) {
//            if(num % i == 0) {
//                sum = sum + i;
//            }
//            i = sum;
//        }
//        return sum == num;
    }
}
