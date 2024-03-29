package DynamicProgramming.Questions.LeetcodeQuestions;

/*
URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                int difference = prices[i] - prices[i - 1];
                profit = profit + difference;
            }
        }

        return profit;
    }
}
