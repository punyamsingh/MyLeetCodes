class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid2.length;
        int n=grid2[0].length;
        boolean[][] vis = new boolean[m][n];
        int islands=0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid2[i][j]==1 && !vis[i][j]){
                    if (traverse(grid1, grid2, vis, i, j)){
                        islands++;
                    }
                }
            }
        }
        return islands;
    }

    boolean traverse(int[][] grid1, int[][] grid2, boolean[][] vis, int i, int j){
        if (i<0 || i>=grid2.length ||
            j<0 || j>=grid2[0].length ||
            grid2[i][j]==0 || vis[i][j]){
            return true;
        }

        vis[i][j] = true;

        // If grid1[i][j] is 0, this part of the island in grid2 is not a sub-island
        boolean isSubIsland = grid1[i][j] == 1;

        // Continue traversal to all 4 directions
        isSubIsland &= traverse(grid1, grid2, vis, i - 1, j);
        isSubIsland &= traverse(grid1, grid2, vis, i + 1, j);
        isSubIsland &= traverse(grid1, grid2, vis, i, j - 1);
        isSubIsland &= traverse(grid1, grid2, vis, i, j + 1);

        return isSubIsland;
    }
}
