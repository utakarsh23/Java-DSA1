package StringsAndPatterns;

public class Patterns {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) { //revise this again
        for (int i = 1; i < 2*n; i++) {
            int totalColinRow = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalColinRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) { //revise this again
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) { //revise this again
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (4-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
