class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int abscount=1;
        for (int i=n-1; i>=0; i--){
            dp[i]=1;
            for (int j=i+1; j<n; j++){
                if (nums[j] > nums[i]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
            abscount = Math.max(abscount,dp[i]);
        }
        return abscount;
    }
}
