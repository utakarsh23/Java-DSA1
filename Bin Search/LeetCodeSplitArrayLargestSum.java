public class LeetCodeSplitArrayLargestSum {

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //in the end of the loop it will contain the max item from the array
            end += nums[i];
            }
        //binary search
        while (start<end) {
            //try for teh middle as answer
            int mid = start+(end-start)/2;

            //calculate how many pieces can you divide this in with this max sum
            int sum =0;
            int pieces = 1;
            for(int num: nums) {
                if(sum + num > mid) {
                    //you cannot add this into subarray, make new one
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > k) {
                start = mid+1;
            }else {
                end = mid;
            }
            }
        return end;
        }
    }
