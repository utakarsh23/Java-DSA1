//https://leetcode.com/problems/richest-customer-wealth/description/
/* Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */
public class leetcode2_summation { //
    public static void main(String[] args) {
        int[][] accounts = {
            {2, 8, 7},
            {7, 1, 3},
            {2, 9, 5}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] account) { //func to look for max value in all coumns
        int max = 0; //max = 0, as initialising teh variable
        for (int customer = 0; customer < account.length; customer++) { //rows(peson)
        int sum1 = 0; //sum1 = 0, sum of the columns will be set here /* here this is above columns because after every coumn the sum has to be set zero so it can get the actual sum of the next row, else the sum of both rows will be added if kept after col loop */
            for (int accountss = 0; accountss < account[customer].length; accountss++) { //loop for columns(accounts)
                sum1 = sum1 + account[customer][accountss]; //sum1 = sum1 + acc[0][0], sum1 = sum1 + acc[0][1], .. sum of columns
            } //
            if(sum1 > max) { //sum1> max. then max will be given the value of sum1
                max = sum1; //here
            }
        }
        return max; //returning the max value
    }
}
