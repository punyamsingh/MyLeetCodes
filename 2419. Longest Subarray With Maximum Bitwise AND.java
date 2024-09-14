class Solution {
    public int longestSubarray(int[] nums) {
        int m=0;
        for (int i: nums) m=Math.max(m, i);
        int res=0;
        int c=0;
        for (int j=0; j<nums.length; j++){
            if (nums[j]==m) res=Math.max(res, ++c);
            else c=0;
        }
        return res;
    }
}
