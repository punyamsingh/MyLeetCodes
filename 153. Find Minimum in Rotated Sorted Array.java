class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        int m=l + (h-l)/2;
        int f=nums[0];
        while (l<=h){
            
            if (nums[l]<=nums[h]){
                f=Math.min(f, nums[l]);
                break;
            }

            m=l + (h-l)/2;
            f=Math.min(f, nums[m]);
                
            if (nums[m]>=nums[l]){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return f;
    }
}
