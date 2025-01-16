package Backtracking;

public class N_Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
        // Base case: All knights are placed
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        // If we reach the end of the board
        if (row == board.length) {
            return;
        }

        // If we reach the end of a row, move to the next row
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        // Place the knight if it's safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false; // Backtrack
        }

        // Skip placing the knight and move to the next cell
        knight(board, row, col + 1, knights);
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check for knight's moves
        int[][] moves = {
                {-2, -1}, {-1, -2}, {-2, 1}, {-1, 2}
        };

        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (isValid(board, newRow, newCol) && board[newRow][newCol]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
}