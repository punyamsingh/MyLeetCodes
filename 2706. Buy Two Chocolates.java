class Solution {
    public int buyChoco(int[] prices, int money) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int i=0; i<prices.length; i++){
            if (prices[i]<a){
                b=a;
                a=prices[i];
            }
            else{
                b=Math.min(b, prices[i]);
            }
        }
        int c=(money-(a+b));
        if (c>=0) return c;
        else return money;
    }
}
