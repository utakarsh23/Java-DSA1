package Recursion.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 99};
        System.out.println(sortedArray(arr, 0));
    }
    static boolean sortedArray(int[] arr, int index) {
        if(index == arr.length-1) return true;
        return arr[index] < arr[index+1] && sortedArray(arr, index+1);
    }
}
