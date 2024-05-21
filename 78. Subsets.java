class Solution {
    public List<List<Integer>> subsets(int[] nums) {      
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int n : nums){
            int rs=result.size();
            for (int i=0; i<rs; i++){
                List<Integer> nl = new ArrayList<>(result.get(i));
                nl.add(n);
                result.add(nl);
            }
        }
        return result;
    }
}
