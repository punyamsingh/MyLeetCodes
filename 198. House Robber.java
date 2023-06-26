class Solution {
    // int loot = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return score(nums, 0);
    }

    public int score(int[] nums, int x){
        int y = nums.length-1;
        if (x > y) return 0;
        if (map.containsKey(x)) return map.get(x);
        if (y-x < 1){
            if (nums[y]>nums[x]){
                map.put(x, nums[y]);
                return nums[y];
            }
            else{
                map.put(x, nums[x]);
                return nums[x];
            }
        }
        map.put(x, Math.max(nums[x] + score(nums, x+2), nums[x+1] + score(nums, x+3)));
        return map.get(x);
    }
}
