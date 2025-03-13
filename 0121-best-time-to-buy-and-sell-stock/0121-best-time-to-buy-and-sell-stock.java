class Solution {
    public int maxProfit(int[] prices) {
        // int min = Integer.MAX_VALUE;
        // int profit = 0;
        // int maxProfit = 0;
        // for(int i=0;i<prices.length;i++){
        //     min = Math.min(min, prices[i]);
        //     profit = prices[i] - min;
        //     maxProfit = Math.max(maxProfit, profit);
        // }

        // return maxProfit;

        // Using Kadane's Algorithm
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            if((prices[i] - buy) > profit){
                profit = prices[i] - buy;
            }else if(prices[i] < buy){
                buy = prices[i];
            }
        }
        return profit;
    }
}