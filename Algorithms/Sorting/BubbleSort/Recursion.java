package Sorting.BubbleSort;

public class Recursion {
    public static void main(String[] args) {

    }
    static void BubbleSort(int[] arr, int a, int c) {
        if(a == 0) return;
        if(c <  a) {
            if(arr[c] > arr[c+1]) {
                BubbleSort(arr, 0, 0);
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
