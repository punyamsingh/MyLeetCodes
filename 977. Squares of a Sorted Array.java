class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int k=0; k<nums.length; k++){
            if (nums[k]<0){
                nums[k]*=(-1);
            }
        }
        Arrays.sort(nums);
        for (int k=0; k<nums.length; k++){
            int b=nums[k];
            nums[k]*=b;            
        }
        return nums;
        // int[] jums = new int[nums.length];
        // int j=0;
        // for (int a: nums) {
        //     jums[j++]=a*a;
        // }
        // return jums;
    }
}
