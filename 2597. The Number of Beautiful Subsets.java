class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        
        for (int n : nums) {
            int rs=result.size();
            for (int i=0; i<rs; i++){
                List<Integer> nl = new ArrayList<>(result.get(i));
                nl.add(n);
                result.add(nl);
            }
        }
        
        List<List<Integer>> beautifulSubsets = new ArrayList<>();
        for (List<Integer> l : result) {
            if (isBeautiful(l, k)) {
                beautifulSubsets.add(l);
            }
        }
        
        return beautifulSubsets.size()-1;
    }
    
    public boolean isBeautiful(List<Integer> l, int k) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (Math.abs(l.get(i) - l.get(j)) == k) {
                    return false;
                }
            }
        }
        return true;
    }
}
