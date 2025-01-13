package Backtracking;

import java.util.Arrays;

public class ALlDirMovingMaze {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},

        };
        int[][] path = new int[board.length][board[0].length];
//        pathsCounts("", board, 0, 0, path, 1);
        pathsBackTracking("", board, 0, 0);
    }
    static void pathsBackTracking(String p, boolean maze[][], int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
                System.out.println(p);
            return;
        }
        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if(row < maze.length-1) {
            pathsBackTracking(p+'D', maze, row+1, col);
        }
        if(col < maze[0].length-1) {
            pathsBackTracking(p+'R', maze, row, col+1);
        }
        if(row > 0) {
            pathsBackTracking(p+'U', maze, row-1, col);
        }
        if(col > 0) {
            pathsBackTracking(p+'L', maze, row, col-1);
        }

        maze[row][col] = true; //to remove/reverse changes made by that function...
    }

    static void pathsCounts(String p, boolean maze[][], int row, int col, int[][] paths, int steps) {
        paths[row][col] = steps;
        if(row == maze.length-1 && col == maze[0].length-1) {
            for(int[] arr: paths) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        paths[row][col] = steps;

        if(row < maze.length-1) {
            pathsCounts(p+'D', maze, row+1, col, paths, steps+1);
        }
        if(col < maze[0].length-1) {
            pathsCounts(p+'R', maze, row, col+1, paths, steps+1);
        }
        if(row > 0) {
            pathsCounts(p+'U', maze, row-1, col, paths, steps+1);
        }
        if(col > 0) {
            pathsCounts(p+'L', maze, row, col-1, paths, steps+1);
        }

        maze[row][col] = true; //to remove/reverse changes made by that function...
        paths[row][col] = 0;
    }
}
