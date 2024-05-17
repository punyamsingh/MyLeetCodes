class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int row = 0; row < grid.length; row++)  {
            int key = getRowSum(grid, row);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int count = 0;
        for (int col = 0; col < grid.length; col++) {
            int key = getColSum(grid, col);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
        }

        return count;
    }

    private int getRowSum(int[][]grid, int row) {
        int sum = 0;
        for(int i : grid[row])
            sum  = i + sum * 5;
        return sum;
    }

    private int getColSum(int[][] grid, int col) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++)
            sum = grid[i][col] + sum * 5;
        return sum;
    }
}
