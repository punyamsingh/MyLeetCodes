class Solution {
    public int countPrimes(int n) {
        boolean[] nums = new boolean[n+1];
        if (n<2) return 0;
        nums[2]=false;
        int ans=0;
        for (int i=2; i<n; i++){
            if (!nums[i]){
                ans++;
                for (int mark=i; mark<n; mark+=i){
                    nums[mark]=true;
                }
            }
            
        }
        return ans;
    }
}
