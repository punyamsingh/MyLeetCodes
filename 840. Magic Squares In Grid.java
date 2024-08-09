class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for (int i=0; i<m-2; i++){
            for (int j=0; j<n-2; j++){
                Set<Integer> s= new HashSet<>();
                for (int k=0; k<3; k++){
                    for (int l=0; l<3; l++){
                        if (grid[k+i][l+j]>9 || grid[k+i][l+j]<1) continue;
                        s.add(grid[k+i][l+j]);
                    }
                }
                if (s.size()!=9) continue;

                int sum1=grid[i][j]+grid[i][j+1]+grid[i][j+2];
                int sum2=grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
                int sum3=grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];

                int sum4=grid[i][j]+grid[i+1][j]+grid[i+2][j];
                int sum5=grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1];
                int sum6=grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2];
                
                int sum7=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
                int sum8=grid[i+2][j]+grid[i+1][j+1]+grid[i][j+2];

                if (sum1==sum2 && 
                    sum2==sum3 &&
                    sum3==sum4 &&
                    sum4==sum5 &&
                    sum5==sum6 &&
                    sum6==sum7 &&
                    sum7==sum8 &&
                    sum8==sum1){
                    count++;
                }
            }
        }
        return count;
    }
}
