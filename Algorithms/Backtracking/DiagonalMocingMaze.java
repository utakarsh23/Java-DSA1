package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class DiagonalMocingMaze {
    public static void main(String[] args) {
        System.out.println(PathNamesDiagonal("", 3, 3));
    }

    static List<String> PathNamesDiagonal(String s, int row, int col) {
        if(row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        List<String> str = new ArrayList<>();
        if(row > 1 && col > 1) {
            str.addAll(PathNamesDiagonal(s+"D", row-1, col-1));
        }
        if(col > 1) {
            str.addAll(PathNamesDiagonal(s+"V", row, col-1));
        }
        if(row > 1) {
            str.addAll(PathNamesDiagonal(s+"H", row-1, col));
        }

        return str;
    }
}
