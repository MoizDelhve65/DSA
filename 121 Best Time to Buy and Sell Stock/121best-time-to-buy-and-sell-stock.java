class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, min = prices[0], profit = 0;
        for (int i = 0; i < prices.length ; i++) {
            min = Math.min(min, prices[i]);
            profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit); 
        }
        return maxProfit;

        
    }
}