package Recursion;
//when a function is being executed it is stored inside the stack memory, until it finishes execution.
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(49));

    }
    static Integer fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacci(n-1) +  fibonacci(n-2);
    }
}
