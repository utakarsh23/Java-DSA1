package Sorting.BubbleSort;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 9, 1, 4, 8};
        BubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr, int r, int c) {
        if(r == 0) return;
        if(c <  r) {
            if(arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            BubbleSort(arr, r, c+1);
        } else {
            BubbleSort(arr, r-1, 0);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
