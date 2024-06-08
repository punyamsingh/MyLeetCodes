class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int running=0;
        map.put(0,-1);
        for (int i=0; i<nums.length; i++){
            running+=nums[i];
            int rem=running%k;
            if (!map.containsKey(rem)) map.put(rem, i);
            else if (i-map.get(rem)>1) return true;
    
        }
        return false;
    }
}
