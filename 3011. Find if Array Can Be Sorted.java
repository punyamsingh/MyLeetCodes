class Solution {
    public boolean canSortArray(int[] nums) {
        int small;
          for (int i = 0; i <nums.length - 1; i++)
          {
            small = i;
            for (int j = i + 1; j < nums.length; j++)
            {
              //if current position is less than previous smallest
              if (nums[j] < nums[small])
              {
                small = j;

                //swap values
                if (count_one(nums[i])!=count_one(nums[small])){
                    return false;
                }

                int temp = nums[i];
                nums[i] = nums[small];
                nums[small] = temp; 
              }
            }
          }
        
      return true;
    }
    public int count_one (int n){
        int count=0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
