class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        if (n==1) return matrix[0][0];

        for (int i=1; i<n; i++){
            for (int j=0; j<n; j++){
                int res;
                if (j==0){
                    res = Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                }
                else if (j==n-1){
                    res = Math.min(matrix[i-1][j-1], matrix[i-1][j]);
                }
                else{
                    res = Math.min(Math.min(matrix[i-1][j-1], matrix[i-1][j]), matrix[i-1][j+1]);
                }
                matrix[i][j] +=res;
            }
        }

        int mi=10001;
        for (int i: matrix[n-1]){
            mi=Math.min(mi, i);
            System.out.println(i);
        }
        return mi;
    }
}
