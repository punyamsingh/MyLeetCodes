class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // RDLU
        int[][] directions = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };

        List<int[]> res = new ArrayList<>();
        int r = rStart, c = cStart;
        res.add(new int[]{r, c});
        int i=0;
        int s=0;
        while (res.size()<rows*cols){
            if (i==0 || i==2) s++;
            for (int k = 0; k < s; k++) {
                r += directions[i][0];
                c += directions[i][1];

                if (r >= 0 && r < rows && c >= 0 && c < cols) // Check if within bounds
                    res.add(new int[]{r, c});
            }
            i = (i+1)%4;
        }

        return res.toArray(new int[rows*cols][2]);

    }
}
