class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        
        int[] right = new int[n];
        int sum=0;
        for (int i=1; i<n; i++){
            sum+=nums[i-1];
            right[i]=sum;
        }
        sum+=nums[n-1];
        int[] left = new int[n];
        for (int i=0; i<n; i++){
            sum=sum-nums[i];
            left[i]=sum;
            if (left[i]==right[i]) return i;
        }
        
        return -1;
    }
}
