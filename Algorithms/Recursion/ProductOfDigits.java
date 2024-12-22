package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(Product(506));
    }
    static int Product(int n) {
        if(n <= 0) return 1;
        return n%10 * Product(n/10);
    }
}
