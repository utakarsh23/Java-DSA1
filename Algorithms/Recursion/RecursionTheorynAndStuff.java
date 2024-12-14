package Recursion;
//when a function is being executed it is stored inside the stack memory, until it finishes execution.
public class RecursionTheorynAndStuff {
    public static void main(String[] args) {
        firstnumbers(0);

    }
    static void firstnumbers(int n) {
        if(n == 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        firstnumbers(n+1);
    }
}
