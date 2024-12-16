package Mathematics;

public class evenNodd {
    public static void main(String[] args) {
        System.out.println(odd(25));
    }
    static boolean odd(int n) {
        return (n & 1) == 1;
    }
}
