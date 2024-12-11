package BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
         int arr[] = {15, 18, 2, 3, 6, 12};
//        int arr[] = {1, 5, 8, 9, 0};
        System.out.println(countRotationOfAnArray(arr));

    }
    static int countRotationOfAnArray(int[] arr) {
        int output = pivoteInRotatedArray(arr)+1;
        return output;
    }

    static int pivoteInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start - (start - end) / 2;
            //1st case here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //2nd case here
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            //3rd case here
            if (arr[start] >= arr[mid]) {
                end = mid-1;
            }
            //4th case here
            else
            {
                start = mid+1;
            }
        }
        return -1;
        }

    }
