class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int max = 0;

        for (int i=0; i<m; i++){
            if (matrix[i][0] == '1'){
                dp[i][0]=1;
                max=1;
            }
        }

        for (int i=0; i<n; i++){
            if (matrix[0][i] == '1'){
                dp[0][i]=1;
                max=1;
            }
        }

        for (int i=1; i<m; i++){
            for (int j=1; j<n; j++){
                if (matrix[i][j] == '1'){
                    int min = Math.min(dp[i][j-1], dp[i-1][j]);
                    min = Math.min(min, dp[i-1][j-1]);
                    dp[i][j] = 1 + min;
                }
                max=Math.max(max,dp[i][j]);
            }
        }

        return max*max;
    }
}
