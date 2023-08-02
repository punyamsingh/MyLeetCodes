class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int islands=0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]=='1' && !vis[i][j]){
                    islands++;
                    traverse(grid, vis, i, j);
                }
            }
        }
        return islands;
    }

    void traverse(char[][] grid, boolean[][] vis, int i, int j){
        if (i<0 || i>grid.length-1 ||
            j<0 || j>grid[0].length-1 ||
            grid[i][j]=='0' || vis[i][j]){
            return;
        }
        vis[i][j]=true;
        if (i!=0) traverse(grid, vis, i-1, j);
        if (j!=0) traverse(grid, vis, i, j-1);
        if (i!=grid.length-1) traverse(grid, vis, i+1, j);
        if (j!=grid[0].length-1) traverse(grid, vis, i, j+1);
    }
}
