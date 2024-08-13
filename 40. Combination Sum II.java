class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans=new ArrayList<>();
        backtrack(candidates, new ArrayList<>(), 0, target);
        return ans;
    }

    public void backtrack(int[] candidates, List<Integer> cur, int i, int target){
        if (target==0){
            ans.add(new ArrayList<>(cur));
        }
        if (target<=0) return;

        int prev=-1;
        for (int j=i; j<candidates.length; j++){
            if (prev==candidates[j]) continue;

            cur.add(candidates[j]);
            backtrack(candidates, cur, j+1, target-candidates[j]);
            cur.remove(cur.size()-1);
            prev=candidates[j];
        }
    }
}
