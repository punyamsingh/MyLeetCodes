class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));

        int m=points[1][0]-points[0][0];
        for (int i=2; i<points.length; i++){
            m=Math.max(m,points[i][0]-points[i-1][0]);
        }
        return m;
    }
}
