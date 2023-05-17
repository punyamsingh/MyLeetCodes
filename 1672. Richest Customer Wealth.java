class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for (int[] i : accounts) {
            int a=IntStream.of(i).sum();
            if (a > sum){
                sum = a;
            }
        }
        return sum;
    }
}
