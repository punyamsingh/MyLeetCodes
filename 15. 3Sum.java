class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        List<Integer> l;
        for (int i=0; i<nums.length; i++){
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum==0){
                    l = new ArrayList<>();
                    l.add(nums[i]);l.add(nums[j++]);l.add(nums[k--]);
                    s.add(l);
                    continue;
                }
                if (sum<0){
                    j++;
                    continue;
                }
                if (sum>0){
                    k--;
                    continue;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
}
