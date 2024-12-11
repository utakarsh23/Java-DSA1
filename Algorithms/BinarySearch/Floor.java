package BinarySearch;

//finding the number which is <= the target element inside the array(Ceiling)
public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 13, 20, 24, 29, 34, 40, 48, 60}; //sorted array
        int target = 41;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target) { //Binary_search function which returns elements if found, if not found then element's nearest element which is just greater than the target element 
        int start = 0; //same for bin search
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end) {
        int mid = start - (start -end)/2;
        if(arr[mid] == target) {
            return mid;
        }
        if(isAsc) {
                if(target > arr[mid]) {
                    start = mid +1;
                } else if(target < arr[mid]) {
                    end = mid -1;
                } else {
                    return mid;
                }
            } else {
                if(target< arr[mid]) {
                    start = mid+1;
                } else if(target > arr[mid]) {
                    end = mid-1;
                } else {
                    return mid;
                }
            }
        }
        return end; //returning start because if not found then the end will be the number next to the target element 
    } //[  end, target, start]
}