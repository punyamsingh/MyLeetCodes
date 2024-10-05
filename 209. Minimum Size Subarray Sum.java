class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int current_sum = 0;
        int min_length = Integer.MAX_VALUE;  // To track the smallest length
        
        for (int right = 0; right < nums.length; right++) {
            current_sum += nums[right];  // Add the current element to the sum
            
            // While current_sum is greater than or equal to target
            while (current_sum >= target) {
                // Update the minimum length of the subarray
                min_length = Math.min(min_length, right - left + 1);
                
                // Subtract the leftmost element and move left pointer to the right
                current_sum -= nums[left];
                left++;
            }
        }
        
        // If no valid subarray was found, return 0
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}
