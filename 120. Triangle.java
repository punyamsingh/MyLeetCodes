class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.isEmpty()) {
            return 0;
        }
        
        int m=triangle.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);

        for (int i=1; i<m; i++){
            dp[i][0] = (dp[i-1][0] + triangle.get(i).get(0));
            dp[i][i] = (dp[i-1][i-1] + triangle.get(i).get(i));
        }

        for (int i=1; i<m; i++){
            for (int j=1; j<i; j++){
                dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
            }
        }

        int mi=dp[m-1][0];
        for (int i: dp[m-1]){
            mi=Math.min(mi, i);
        }
        return mi;
    }
}
