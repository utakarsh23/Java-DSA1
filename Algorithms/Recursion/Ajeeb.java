package Recursion;

public class Ajeeb {
    public static void main(String[] args) {
        allNoTillN(5);
        allNoTillNo(5);
    }
    static void allNoTillN(int n) {
        if(n == 0) return;
        System.out.println(n);
        allNoTillN(--n); //subtract then pass
    }
    static void allNoTillNo(int n) { //does not work
        if(n == 0) return;
        System.out.println(n);
        allNoTillNo(n--); //pass then subtract
    }
}
