class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n=nums.length;

        Integer[] change = new Integer[n];
        long sum=0;
        int i=0;
        for (int el: nums){
            sum+=el;
            change[i++]=((el^k)-(el));
        }
        System.out.println(sum);
        Arrays.sort(change, Collections.reverseOrder());

        for (int m: change) System.out.println(m);

        for (int j=0; j<n-1; j+=2){
            int x =change[j]+change[j+1];
            if (x > 0){
                sum+=(long) x;
            }
        }


        return sum;
    }
}
