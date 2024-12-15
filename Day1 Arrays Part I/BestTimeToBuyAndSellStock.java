public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = prices.length - 2; i >= 0; i--){
            if(prices[i] < prices[i + 1]){
                max = Math.max(max, prices[i+1] - prices[i]);
                prices[i] = prices[i + 1];
            }
        }
        return max;
    }
}
