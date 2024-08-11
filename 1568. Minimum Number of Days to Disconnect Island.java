class Solution {
    public int minDays(int[][] grid) {
        List<List<Integer>> l = new ArrayList<>();

        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if (grid[i][j] == 1){
                    List<Integer> t=new ArrayList<>();
                    t.add(i);
                    t.add(j);
                    l.add(t);
                }
            }
        }

        int x = numIslands(grid);
        if (x>1 || x==0) return 0;
        if (x==1){

            for (List<Integer> y: l){
                grid[y.get(0)][y.get(1)]=0;
                int a=numIslands(grid);
                if (a>1 || a==0) return 1;
                grid[y.get(0)][y.get(1)]=1;
            }
            return 2;
        }
        return 2;
    }

    public int numIslands(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int islands=0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]==1 && !vis[i][j]){
                    islands++;
                    traverse(grid, vis, i, j);
                }
            }
        }
        return islands;
    }

    void traverse(int[][] grid, boolean[][] vis, int i, int j){
        if (i<0 || i>grid.length-1 ||
            j<0 || j>grid[0].length-1 ||
            grid[i][j]==0 || vis[i][j]){
            return;
        }
        vis[i][j]=true;
        if (i!=0) traverse(grid, vis, i-1, j);
        if (j!=0) traverse(grid, vis, i, j-1);
        if (i!=grid.length-1) traverse(grid, vis, i+1, j);
        if (j!=grid[0].length-1) traverse(grid, vis, i, j+1);
    }
}
