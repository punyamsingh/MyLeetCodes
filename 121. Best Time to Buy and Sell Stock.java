class Solution {
    public int maxProfit(int[] prices) {
        int minprice=10000;
        int maxprofit=0;
        for (int i=0; i<prices.length; i++){
            minprice = Math.min(minprice, prices[i]);
            maxprofit = Math.max(maxprofit, prices[i]-minprice);
        }
        return maxprofit;
    }
}
