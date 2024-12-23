package Recursion.Patterns;

public class Patterns {
    public static void main(String[] args) {
//    patt1(5, 5);
    patt4(5, 0);
    }
    static void patt1(int row, int col) {
        if(row == 0) return;
        for (int i = 0; i < row; i++) {
            System.out.print("* ");
        }
        System.out.println();
        patt1(row-1, col);
    }
    static void patt2(int row, int col) {
        if(col == row) return;
        for (int i = 0; i <= col; i++) {
            System.out.print("* ");
        }
        System.out.println();
        patt2(row, col+1);
    }

    static void patt3(int row, int col) {
        if(row == 0) return;

        if(col < row) {
            System.out.print(" * ");
            patt3(row, col+1);
        } else {
            System.out.println();
            patt3(row-1, 0);
        }
    }

    static void patt4(int row, int col) {
        if(row == 0) return;

        if(col < row) {
            patt3(row, col+1);
            System.out.print(" * ");
        } else {
            patt4(row-1, 0);
            System.out.println();
        }
    }
}
