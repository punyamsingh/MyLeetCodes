class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] mR = new int[n];
        mR[n-1]=nums[n-1];
        for (int i=n-2; i>=0; i--){
            mR[i]=Math.max(nums[i], mR[i+1]);
        }

        int left=0;
        int res=0;
        for (int right=0; right<n; right++){
            while (nums[left]>mR[right]){
                left++;
            }
            res=Math.max(res,right-left);
        }
        return res;
    }
}
