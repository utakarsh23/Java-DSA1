package Recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/1485695484/
public class ReduceToZero {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(123));
    }

    //method 1
    static int numberOfSteps(int num) {
        stepsToZero(num);
        return count;
    }

    static int count = 0;
    static void stepsToZero(int n) {
        int rem = n;
        if(n == 0) return;
        if(rem%2 == 0) {
            rem = rem/2;
            count++;
        }
        if (rem%2 != 0) {
            rem = rem-1;
            count ++;
        }
        stepsToZero(rem);
    }

    //method 2
    static int numberOfStepss(int n, int c) {
        return helper(n, c);
    }
    static int helper(int n, int c) {
        if (n == 0) return c;
        if(n%2 == 0) {
            return helper(n/2, c+1);
        }
        return helper(n-1, c+1);
    }

}
