//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
// Given an array nums of integers, return how many of them contain an even
// Example 1:
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation:
// 12 contains 2 digits (even number of digits).
// 345 contains 3 digits (odd number of digits).
// 2 contains 1 digit (odd number of digits).
// 6 contains 1 digit (odd number of digits).
class Solution {
    static int findNumbers(int[] nums) { //func to check no of 2 digit elements present inside an array
        int count = 0; //count = 0, initialisation for no of even digit arrays
        for(int i = 0; i< nums.length; i++) { //here the loop is set to go through every element of teh array
            if(len_dig(nums[i]) % 2 == 0) { //it is to determine the length is even or not
                count++; //count is incremented if the digit in the element is one  
            }
        }
        return count; //returning count
    }
    static int len_dig(int in) { //func for describing length of digits
        int count = 0; //initial count == 0; or we can also //int count = 0;
        while(in > 0) { //condition till 
            in = in/10; //here number is divided by 10, so everytime it get's dicided, the count is incremented by one
            count ++; //here count is the no of digits of the integer
        }
        return count; //returning count
    }
    public static void main(String[] args) { 
        int[] nums = {12, 345, 2, 6, 7896, 67, 980, 987654, 89}; //array to be checked
        System.out.println(findNumbers(nums)); //printing
    }
}