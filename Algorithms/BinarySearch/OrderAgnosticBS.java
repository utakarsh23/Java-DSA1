package BinarySearch;

//OrderAgnosticBinarySearch Algorithm
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 13, 20, 24, 29, 34, 40, 48, 60}; // ascending sorted array
        int target = 29; 
        System.out.println(OABS(arr, target)); //asc
        int[] arr1 = {90, 65, 43, 29, 21, 20, 17, 13, 12}; //descending sorted array
        System.out.println(OABS(arr1, target)); //dec
    }
    static int OABS(int[] arr, int target) { //Binary_search function
        int start = 0; //start = 0th index, 
        int end = arr.length -1; //mid = middle index
        boolean isAsc = arr[start] < arr[end]; //to determine if the array is ascending or descending by comparing 1st and last element.
        while(start <= end) { //while start <= end;, if this fails then that means middle has crossed each other and mid is found
            int mid = start - (start-end)/2; //formula for the mid, ie. it is as same as (start-end)/2
            if(arr[mid] == target) {
                return mid; //return mid || ie. if the first mid(start(0) - (start(0) - end(len.arr-1))/2) is the target 
            }
            if(isAsc) { /*//ascending//*/ //sorted array
                if(target > arr[mid]) { //if target > middle element then it goes to the right side checking as the array is sorted
                    start = mid + 1; //start will be changes to the middle element found
                } else { //if target < middle element them it goes to check the left side checking 
                    end = mid -1; //so end will change not the starting si end will be mid -1 
                }
            } else { /*//descending//*/ //sorted array
                if(target < arr[mid]) { //if target < middle element then it gies to the right side checking as the array is sorted
                    start = mid + 1; //start will be changes to the middle element found
                } else { //if target < middle element them it goes to check the left side checking 
                    end = mid -1; //so end will change not the starting si end will be mid -1 
                }
            }
            
        }
        return -1; //if target is not found then we return -1
    }
}