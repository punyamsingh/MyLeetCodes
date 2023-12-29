class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i;
        for (i=1; i<matrix.length; i++){
            if (target<matrix[i][0]){
                break;
            }
        }
        for (int j=0; j<matrix[i-1].length; j++){
            if (target==matrix[i-1][j]){
                return true;
            }
        }
        return false;
    }
}
