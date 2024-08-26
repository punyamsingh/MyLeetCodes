class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] mL = new int[n];
        int[] mR = new int[n];

        int x=height[0];
        for (int i=0; i<height.length; i++){
            mL[i]=Math.max(x, height[i]);
            x=mL[i];
        }
        int y=height[n-1];
        for (int i=n-1; i>=0; i--){
            mR[i]=Math.max(y, height[i]);
            y=mR[i];
        }

        int sum=0;
        for (int i=0; i<n; i++){
            int k = Math.min(mL[i], mR[i]);
            if (k-height[i]>0) sum+=(k-height[i]);
        }
        return sum;
    }
}
