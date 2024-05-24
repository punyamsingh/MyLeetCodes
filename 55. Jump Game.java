class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] dp = new boolean[n];
        for (int i=n-1; i>=0; i--){
            if (nums[i]+i >= n-1) dp[i]=true;
            else{
                for (int j=0; j<=nums[i]; j++){
                    if (dp[j+i]){
                        dp[i]=true;
                        break;
                    }
                }
            }
        }
        return dp[0];
    }
}
