class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: nums){
            pq.add(i);
        }
        long score=0;
        for(int i=0; i<k; i++){
            int temp = pq.poll();
            score += temp;
            double s = (double)temp/3;
            pq.add((int)Math.ceil(s));
        }

        return score;
    }
}
