class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        return helper(s, 0, n-1, new int[n][n]);
    }

    int helper(String s, int i, int j, int[][] dp){
        if (dp[i][j] != 0){
            return dp[i][j];
        }
        if (i>j) return 0;
        if (i==j) return 1;

        if (s.charAt(i) == s.charAt(j)){
            dp[i][j] = 2 + helper(s, i+1, j-1, dp);
        }
        else{
            dp[i][j] = Math.max(helper(s, i+1, j, dp), helper(s, i, j-1, dp));
        }

        return dp[i][j];
    }
}
