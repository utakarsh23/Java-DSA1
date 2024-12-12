package Sorting.CycleSort;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctInd = arr[i]; // -> when Array contains zero
//          int correctInd = arr[i]-1; //  --> when Array does not contain zero
            if(arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
