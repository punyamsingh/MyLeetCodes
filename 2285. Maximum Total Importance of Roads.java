class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] degree = new long[n];
        for (int i=0; i<roads.length; i++){
            degree[roads[i][0]]+=1;
            degree[roads[i][1]]+=1;
        }
        Arrays.sort(degree);
        long sum=0;
        for (int j=0; j<n; j++){
            sum+=((j+1)*degree[j]);
        }
        return sum;
    }
}
