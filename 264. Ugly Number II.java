class Solution {    
    public int nthUglyNumber(int n) {
        if (n<=6){
            return n;
        }
        int[] nums = new int[n];
        int index2 = 0, index3 = 0, index5 = 0;
        nums[0] = 1;
        for(int i = 1; i < nums.length; i++){
            int ni2=nums[index2] * 2;
            int ni3=nums[index3] * 3;
            int ni5=nums[index5] * 5;
            nums[i] = Math.min(ni2, Math.min(ni3, ni5));
            if(nums[i] == ni2)
                index2++;
            if(nums[i] == ni3)
                index3++;
            if(nums[i] == ni5)
                index5++;
        }
        return nums[n - 1];
    }
}
