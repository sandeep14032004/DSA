/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        int minSofar = prices[0];
        for (int i = 0; i < n; i++) {
            minSofar = Math.min(minSofar, prices[i]);
            int profit = prices[i] - minSofar;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
// @lc code=end

// public int maxProfit(int[] prices) {
// int maxProfit = 0;
// int n = prices.length;
// int dupl[] = new int[n];
// dupl[n - 1] = prices[n - 1];
// for (int i = n - 2; i >= 0; i--) {
// dupl[i] = Math.max(dupl[i + 1], prices[i]);
// }
// for (int i = 0; i < n - 1; i++) {
// maxProfit = Math.max(maxProfit, dupl[i + 1] - prices[i]);
// }
// return maxProfit;
// }