class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;
        for (int i=1; i<n; i++){
            int c=prices[i]-prices[i-1];
            if (c>0) profit+=c;
        }
        return profit;
    }
}
