class Solution {
    int m;
    int n;
    public void solve(char[][] board) {
        m=board.length;
        if (m==0) return;
        n=board[0].length;

        for (int i=0; i<m; i++){
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][n-1] == 'O') dfs(board, i, n-1);
        }

        for (int i=0; i<n; i++){
            if (board[0][i] == 'O') dfs(board, 0, i);
            if (board[m-1][i] == 'O') dfs(board, m-1, i);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == 'S') board[i][j] = 'O';
            }
        }
    }

    void dfs(char[][] board, int i, int j){
        if(i<0 || i>=m || j>=n || j<0) return;
        if (board[i][j] != 'O') return;
        board[i][j]='S';
        dfs(board, i-1, j);
        dfs(board, i, j-1);
        dfs(board, i+1, j);
        dfs(board, i, j+1);
    }
}
