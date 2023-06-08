class Solution {
    public int countNegatives(int[][] grid) {
        // int m=grid.length;
        int n=grid[0].length;
        int total=0;
        int b=-1;
        for (int i=grid.length-1; i>-1; i--){
            int j=n-1;
            while (j>b && grid[i][j--]<0) total++;
            b=j;
        }
        return total;
    }
}
