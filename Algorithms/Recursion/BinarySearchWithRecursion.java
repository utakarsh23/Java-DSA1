package Recursion;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 66 ;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
        System.out.println(binarySearchh(arr, target, 0, arr.length-1));
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid] == target) {
            return mid;
        }
        if(target < arr[mid]) {
            return binarySearch(arr, target, start, mid-1);
        }
        return binarySearch(arr, target, mid+1, end);
    }

    //both are same;;;
    static int binarySearchh(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start+(end-start)/2;

        if(target < arr[mid]) {
            return binarySearch(arr, target, start, mid-1);
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid+1, end);
        } else {
            return mid;
        }
    }
}
