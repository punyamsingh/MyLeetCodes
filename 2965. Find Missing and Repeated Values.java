class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n=grid.length;
        long n2=n*n;
        long sm=0;
        long s2m=0;

        long sn=(n2 * (n2 + 1)) / 2;
        long s2n=(n2 * (n2 + 1) * (2 * n2 + 1)) / 6;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                sm += (long) grid[i][j];
                s2m += (long) (grid[i][j]*grid[i][j]);
            }
        }
        // System.out.println("n "+n);
        // System.out.println("n2 "+n2);
        // System.out.println("sm "+sm);
        // System.out.println("s2m "+s2m);
        // System.out.println("sn "+sn);
        // System.out.println("s2n "+s2n);

        long p=s2m-s2n;
        long q=sm-sn;
        long z= p/q;
        // System.out.println("p "+p);
        // System.out.println("q "+q);
        // System.out.println("z "+z);
        int x= (int) (q+z)/2;
        int y= (int) (z-x);
        return new int[]{x, y};
    }
}
