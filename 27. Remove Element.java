class Solution {
    public int removeElement(int[] nums, int val) {
        int p = 0, i = 0;
        while (i < nums.length){
            if (nums[i++] != val){
                nums[p++] = nums[i-1];
            }
        }
        return p;
    }
}
