package Sorting.MergeSort;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 0, 3, 2, 1};
//        System.out.println(Arrays.toString(mergeSort(arr, 0, args.length/2, args.length)));
        int[] ass = mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(ass));
    }

    static int[] mergeSort(int[] arr, int start, int end) {
        if(end - start == 1) {
            return null;
        }
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
        return arr;
    }


    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;
        while (i< mid && j < end) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //for arrays not being of same size, i.e left = [a, b, c], right = [d, e, f, g, h]
        //the left-out(extra elements) will be added to the mixed array as it's already sorted.
        while (i< mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
//        for (int l = 0; l < mix.length; l++) {
//            arr[start + l] = mix[l];
//        }
        System.arraycopy(mix, 0, arr, start + 0, mix.length);
    }
}
