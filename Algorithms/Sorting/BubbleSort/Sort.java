package Sorting.BubbleSort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arrr = {-1, 2, -5, 9, 0, 27, -99};
        bubbleSort(arrr);
        System.out.println(Arrays.toString(arrr));
    }
    //main
    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
