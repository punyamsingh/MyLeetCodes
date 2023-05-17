class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer, Integer> map= new HashMap<>();
        // int n=nums.length;
        // for (int i=0; i<n; i++){
        //     if (map.containsKey(nums[i])){
        //         map.remove(nums[i]);
        //     }
        //     else{
        //         map.put(nums[i], i);
        //     }
        // }
        // List<Integer> list = new ArrayList<Integer>(map.keySet());
        // return list.get(0);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
