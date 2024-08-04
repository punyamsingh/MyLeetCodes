class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int res=0;
        while (r<n-1){
            int far=0;
            for (int i=l; i<r+1; i++){
                far=Math.max(far,i+nums[i]);
            }
            l=r+1;
            r=far;
            res++;
        }
        return res;
    }
}
