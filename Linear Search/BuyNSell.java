public class BuyNSell {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock

    public static void main(String[] args) {
        int[] arr = {2, 4, 1};
        System.out.println(maxProfit(arr));
    }//////////
        static int maxProfit(int[] prices) {
            int min = prices[0];
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                } else if (prices[i] - min > profit) {
                    profit = prices[i] - min;
                }
            }
            return profit;
        }
}
