class Solution {
    public int maxSubArray(int[] nums) {
        int cursum=0, maxsum=Integer.MIN_VALUE;
        for (int i:nums){
            cursum+=i;
            maxsum=Math.max(maxsum, cursum);
            if (cursum<0) cursum=0;
        }
        return maxsum;
    }
}
