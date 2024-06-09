class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefix=0;
        map.put(0,1);
        int result=0;
        for (int i=0; i<nums.length; i++){
            prefix+=nums[i];
            int rem=prefix-k;
            result += map.getOrDefault(rem, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return result;
    }
}
