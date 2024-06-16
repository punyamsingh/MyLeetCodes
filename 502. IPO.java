class Solution {
    class Share {
        int capital, profit;

        public Share(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Share> minheap = new PriorityQueue<>((share1, share2) -> Integer.compare(share1.capital, share2.capital));
        PriorityQueue<Share> maxheap = new PriorityQueue<>((share1, share2) -> Integer.compare(share2.profit, share1.profit));
        for (int i=0; i<profits.length; i++){
            minheap.add(new Share(capital[i], profits[i]));
        }

        while (k>0){
            while (!minheap.isEmpty() && minheap.peek().capital<=w){
                maxheap.add(minheap.poll());
            }
            if (maxheap.isEmpty()) break;
            w+=maxheap.poll().profit;
            k--;
        }
        return w;
    }
}
