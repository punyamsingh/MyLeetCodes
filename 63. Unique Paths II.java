class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m-1][n-1]==1) return 0;
        int[][] grid = new int[m][n];
        for (int i=0; i<n; i++){
            if (obstacleGrid[0][i] == 0) grid[0][i] = 1;
            else break;
        }
        for (int i=0; i<m; i++){
            if (obstacleGrid[i][0] == 0) grid[i][0] = 1;
            else break;
        }

        for (int i=1; i<m; i++){
            for (int j=1; j<n; j++){
                int res=0;
                if (obstacleGrid[i-1][j] == 0) res+=grid[i-1][j];
                if (obstacleGrid[i][j-1] == 0) res+=grid[i][j-1];
                grid[i][j] = res;
            }
        }
        return grid[m-1][n-1];
    }
}
