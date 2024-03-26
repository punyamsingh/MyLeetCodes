class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for (int j=0; j<n; j++){
            if (j!=(n-j-1))
                sum+=(mat[j][j]+mat[j][n-j-1]);
            else
                sum+=mat[j][j];
        }
        return sum;
    }
}
