class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++)
        {
            if(buyprice>prices[i])
            {
                 buyprice=prices[i];
            }
            else
            {
            int profit=prices[i]-buyprice;
             maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }
}