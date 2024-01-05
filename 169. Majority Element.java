class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length==1) return nums[0];

        int c=0;
        int e=-1;
        for (int i: nums){
            if (c==0) e=i;
            if (i==e) c++;
            else c--;
        }
        return e;
    }
}
