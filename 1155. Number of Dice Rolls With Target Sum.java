class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int MOD = (int)Math.pow(10, 9) + 7;
        long[][] dp = new long[n + 1][target + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                for (int z = 1; z <= k; z++) {
                    if (j >= z) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - z]) % MOD;
                    } else {
                        break;
                    }
                }
            }
        }
        return (int)dp[n][target];
    }
}
