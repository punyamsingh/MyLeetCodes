class Solution {
    int[] dp;
    
    public int deleteAndEarn(int[] nums) {
        int maxv=0;
        for(int x: nums)
            maxv = Math.max(maxv,x);

        int[] a = new int[maxv+1];
        dp = new int[maxv+1];

        for(int x: nums)
            a[x]+=x;
        return delete(a, 0);
    }

    public int delete(int[] nums, int x){
        if (x >= nums.length) return 0;
        if (dp[x]>0) return dp[x];

        
        if (nums.length-x < 2){
            dp[x] = Math.max(nums[nums.length-1], nums[x]);
        }
        else{
            dp[x] = Math.max(nums[x] + delete(nums, x+2), nums[x+1] + delete(nums, x+3));
        }
        return dp[x];
    }
}
