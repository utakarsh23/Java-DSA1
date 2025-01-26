package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class flippingAImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
//        System.out.println(Arrays.toString(flipAndInvertImage(image)));
        int[][] result = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(result));
    }

    static int[][] flipAndInvertImage(int[][] image) {
//        for (int i = 0; i < image.length; i++) {
//                flipp(image, i);
//        }
        for (int i = 0; i < image.length; i++) {
                invert(image, i);
        }
        return image;
    }

    static void invert(int[][] image, int row) {
        int i = 0;
        int j = image[row].length;
        while (i < j) {
            image[row][i]= image[row][i]^1;
            i++;
        }
    }

    static void flipp(int[][] image, int row) {
        int i = 0;
        int j = image[row].length;
        while (i < j/2) {
            int temp = image[row][i];
            image[row][i] = image[row][image[row].length-i-1];
            image[row][image[row].length-i-1] = temp;
            i++;
        }
    }
}
