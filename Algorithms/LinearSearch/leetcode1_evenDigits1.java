package LinearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class Solution1 {
    static int findNumbers(int[] nums) { //func to get even digit elements
        int count = 0; //count = 0, count represents number of elements with even digit
        for(int num : nums) { //loop to get each element of the array
            if(even(num)) { //checking if it is even or not
                count++; //if it is even then count grows
            }
        }
        return count;
    }
    static boolean even(int num) { //func that returns true for even and false for odd 
        int noOfDigits = digits(num); //noOdDigits = digits(num)
        return noOfDigits % 2 == 0; //digits(num) % 2 == 0 : true -> return true || :false -> return false 
    }
    static int digits(int num) { //func for counting digits of integer
        int count = 0; //count = 0; initialisation with zero, count is no of digits
        while(num > 0) {   //while num < 0; ie. (n digit no)/10 > 0, (n-1 digit no)/10 > 0,... (2 digit no)/10 > 0, (1 digit no)/10 > 0 
            num = num/10; //num gets divided by 10, so numbers last digit gets removed || ie. 567/10 = 56; 56/10 = 5; 5/10 = 0
            count ++; //count increments till num gets 0
        }
        return count; // returning count
    }
    public static void main(String[] args) { 
        int[] nums = {12, 345, 2, 4567, 89}; //arraay to be printed
        System.out.println(findNumbers(nums)); //printings
    }
}