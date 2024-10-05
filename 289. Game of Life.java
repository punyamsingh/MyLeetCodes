class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                int k = neighs(board, i, j);
                if (board[i][j]==1 && (k==2 || k==3)) board[i][j]=3;
                if (board[i][j]==0 && (k==3)) board[i][j]=2;
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                board[i][j] >>= 1;
            }
        }
    }

    int neighs(int[][] board, int i, int j){
        int ans=0;
        int m=board.length;
        int n=board[0].length;
        for (int a=i-1; a<=i+1; a++){
            for (int b=j-1; b<=j+1; b++){
                if (a<m && a>=0 && b<n && b>=0){
                    ans+=(board[a][b]&1);
                }
            }
        }
        ans -= (board[i][j]&1);
        return ans;
    }
}
