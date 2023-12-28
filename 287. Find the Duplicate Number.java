class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] found = new int[n+1];
        for (int i=0; i<n; i++){
            if (found[nums[i]]==1) return nums[i];
            else found[nums[i]]=1;
        }
        return -1;
    }
}
