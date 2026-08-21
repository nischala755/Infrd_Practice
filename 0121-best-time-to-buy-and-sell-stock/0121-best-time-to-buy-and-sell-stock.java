class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int cur_profit=0;
        int max_profit=0;
        int min_buy=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min_buy)
            {
                min_buy=Math.min(prices[i],min_buy);
            }
            if(prices[i]!=min_buy)
            {
                cur_profit=prices[i]-min_buy;
                max_profit=Math.max(cur_profit,max_profit);
            }

        }
        return max_profit;
        
    }
}