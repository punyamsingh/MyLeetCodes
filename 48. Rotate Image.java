class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                int a = matrix[i][j];
                int b = matrix[j][i];
                matrix[j][i]=a;
                matrix[i][j]=b;
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n/2; j++){
                int a = matrix[i][j];
                int b = matrix[i][n-j-1];
                matrix[i][n-j-1]=a;
                matrix[i][j]=b;
            }
        }
    }
}
