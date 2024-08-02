class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int k=0;
        for (int v: nums)
            if (v == 1) k++;
        int r=0;
        int f=0;
        for (int i=0; i<n*2; i++){
            if (nums[i%n]==1) r++;
            if (i>=k && (nums[(i-k)%n]==1)) r--;
            // if (i<k){
            //     if (nums[i]==1) r++;
            // }
            // else{
            //     if (nums[(i-k)%n]==1) r--;
            //     if (nums[i%n]==1) r++;
            // }
            f=Math.max(f,r);
        }
        return k-f;
    }
}
