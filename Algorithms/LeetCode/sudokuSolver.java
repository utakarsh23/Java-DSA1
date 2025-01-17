package LeetCode;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 0, 8, 6, 3, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 2, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        System.out.println(solveSudoku(board));

    }
    static boolean solveSudoku(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        //this ishow we are replacing r,c with argumrnts
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row then break
            if(emptyLeft == false) {
                break;
            }
        }
        if(emptyLeft == true) {
            return true;
        }
        //backtract
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)) {
                board[row][col] = number;
                if(solveSudoku(board)) {
                    //found the and
                    display(board);
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;

    }
    static boolean isSafe(int[][] board, int row, int col, int num) {
        //check the row
        for (int i = 0; i < board.length; i++) {
            //check if the no is in the roq or not
            if(board[i][col] == num) {
                return false;
            }
        }

        //check the col
        for (int[] nums: board) {
            //check if the no is in the col or not
            if(nums[col] == num) {
                return false;
            }
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col-col%sqrt;
        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c <colStart + sqrt ; c++) {
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    static void display(int[][] board){
        for(int[] row: board) {
            for(int ele: row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
