class Solution {
    public int countElements(int[] nums) {
        int n=nums.length;
        if (n<3){
            return 0;
        }
        int maxe = nums[0];
        int mac=0;
        int mine = nums[0];
        int mic=0;
        for (int i: nums){
            if (i==maxe) mac++;
            if (i==mine) mic++;
            if (i>maxe) {
                maxe=i;
                mac=1;
            }
            if (i<mine) {
                mine=i;
                mic=1;
            }
        }
        
        return (n-mac-mic>0)?(n-mac-mic):0;
    }
}
