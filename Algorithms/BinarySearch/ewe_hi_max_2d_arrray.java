package BinarySearch;

public class ewe_hi_max_2d_arrray {
    public static void main(String[] args) {
       int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {144, 56, 78}};
        System.out.println(summ(arr));
    }
    static int summ(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j]; //sum[i] = {1, 2, 3} then sum[j] = {4, 5, 6}
            }
            if(max < sum) {
                max = sum;
            }
        }
        return max;
    }
}