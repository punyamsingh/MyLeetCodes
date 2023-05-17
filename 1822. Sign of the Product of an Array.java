class Solution {
    public int arraySign(int[] nums) {
        // if 0 in nums{
        //     return 0;
        // }
        // Stack<Integer> stack = new Stack<Integer>();
        int a=1;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==0){
                return 0;
            }
            if (nums[i]<=0){
                a*=-1;
            }
        }
        return a;

    }
}
