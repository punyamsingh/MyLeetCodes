class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        boolean z=false;

        int p=1;
        int lm=nums[0];

        for (int i=0; i<n; i++){
            p*=nums[i];
            if (nums[i]==0){
                p=1;
                z=true;
                continue;
            }
            lm = Math.max(lm,p);
        }

        p=1;
        int rm=nums[n-1];

         for (int i=n-1; i>=0; i--){
            p*=nums[i];
            if (nums[i]==0){
                p=1;
                z=true;
                continue;
            }
            rm = Math.max(rm,p);
        }

        int k=Math.max(lm,rm);
        return z?(k>0?k:0):k;
    }
}
