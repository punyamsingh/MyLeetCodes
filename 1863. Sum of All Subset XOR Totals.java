class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums,0,0);
    }
    
    int dfs(int[] arr,int i,int cur){
        if(i==arr.length){
            return cur;
        }
        return dfs(arr,i+1,cur^arr[i]) + dfs(arr,i+1,cur);
    }
}
