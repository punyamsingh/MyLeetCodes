class Solution {
    public void moveZeroes(int[] nums) {
        int firstzero=-1;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==0){
                firstzero=i;
                break;
            }
        }
        if (firstzero==-1){
            return;
        }
        for (int i=firstzero+1; i<nums.length; i++){
            if (nums[i]!=0){
                int temp=nums[i];
                int temp2=nums[firstzero];
                nums[firstzero]=temp;
                nums[i]=temp2;

                firstzero++;
            }
        }
        
    }
}
