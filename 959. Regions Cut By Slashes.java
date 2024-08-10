class Solution {
    public int regionsBySlashes(String[] grid) {
        int rows = grid.length;
        int cols = grid[0].length();

        // Create a 3x3 expanded grid to handle slashes
        int[][] matrix = new int[rows * 3][cols * 3];

        // Populate the matrix based on '/' and '\\' in the original grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i].charAt(j) == '/') {
                    matrix[i * 3][j * 3 + 2] = 1;
                    matrix[i * 3 + 1][j * 3 + 1] = 1;
                    matrix[i * 3 + 2][j * 3] = 1;
                } else if (grid[i].charAt(j) == '\\') {
                    matrix[i * 3][j * 3] = 1;
                    matrix[i * 3 + 1][j * 3 + 1] = 1;
                    matrix[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }
        boolean[][] vis = new boolean[rows*3][cols*3];
        int islands=0;
        for (int i=0; i<rows*3; i++){
            for (int j=0; j<cols*3; j++){
                if (matrix[i][j]==0 && !vis[i][j]){
                    islands++;
                    traverse(matrix, vis, i, j);
                }
            }
        }
        return islands;
    }

    void traverse(int[][] matrix, boolean[][] vis, int i, int j){
        if (i < 0 || i >= matrix.length ||
            j < 0 || j >= matrix[0].length ||
            matrix[i][j] == 1 || vis[i][j]) {
            return;
        }

        vis[i][j] = true;

        traverse(matrix, vis, i - 1, j);
        traverse(matrix, vis, i + 1, j);
        traverse(matrix, vis, i, j - 1);
        traverse(matrix, vis, i, j + 1);
    }
}
