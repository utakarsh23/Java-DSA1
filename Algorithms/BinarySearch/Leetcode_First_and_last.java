package BinarySearch;//BinarySearch.Leetcode_First_and_last, to print the first and last element of th etarget array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=problem-list-v2&envId=binary-search
import java.util.Arrays;
public class Leetcode_First_and_last {
    public static void main(String[] args) {
       int[] nums = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9};
       int target = 5;
       System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) { //func to check the range(main func)
        int[] ans = {-1, -1}; //if element not found then to be returned
        int start = search(nums, target, true); //start value variable taken from search function as to print the start
        // index of the element after checking || explanation below in the search func comments
        int end = search(nums, target, false); //start value variable taken from search function as to print the end
        // index of the element after checking
        ans[0] = start; //replacing the value of index from -1 to start,,,,
        ans[1] = end;
        return ans; //returning the final answer
    }
        
    public static int search(int[] nums, int target, boolean isStartIndex) { //func to search the element in the array
        int ans = -1; // ans is the variable that is to be returned
        int start = 0;  //start binary search 1st,
        int end = nums.length - 1;  //end of binary search 1st
        
        while (start <= end) { //loop will break when start <= end, i.e: all elements searched
            int mid = start - (start - end) / 2; //middle formula, (start+end)/2
            if (target < nums[mid]) { //if target < arr[mid] then searching to be done on the left side (decreasing side)
                end = mid - 1; //so turning the end in the middle(mid-1--> element prior to the one checked)
            } else if (target > nums[mid]){ //if target > arr[mid] then searching to be done on the right side(increasing side)
                start = mid + 1; ////so turning the start in the middle(mid+1--> element post to the middle checked which just got checked)
            } else { //if both the condition fails(mid value found) as mid ele does not equals in the past two conditions,,
                ans = mid; //ans to be given the value of mid to be returned;
                if(isStartIndex) { //true //if isStartIndex = true, then the end element will be changed in between them to check
                    //the other elements in between them(if target is also present there);;
                    end = mid-1; //end being changes
                } else { //if isStartIndex = false then start will be changd, same reason as above
                    start = mid+1;//
            }
        }
    }
    return ans; //returning ans(after checking the start/end index of the element)
}
}
