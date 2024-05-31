class Solution {
    public int[] singleNumber(int[] nums) {
        int t=0;
        for (int i: nums) t^=i;
        t &= -t;
        int[] ans= new int[2];
        for (int i:nums){
            if ((i&t) == 0) ans[0]^=i;
            else ans[1]^=i;
        }
        return ans;
    }
}
