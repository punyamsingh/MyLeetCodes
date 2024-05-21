class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        f(nums, 0, new int[nums.length], 0,ans);
        return ans;
        //path[] go into cur, cur go into ans
        // 下一组的第一个数的位置
        // 当前数x，要0个 // 当前数x，要1个、要2个、要3个...都尝试
    }
    public static void f(int[] nums, int i, int[ ] path, int size, List<List<Integer>> ans){
        if(i==nums.length){
            List<Integer> cur=new ArrayList<>();
            for(int j=0;j<size;j++){
cur.add(path[j]);//???????
            }            
            ans.add(cur);
        }else{
            int j=i+1;
            while(j<nums.length && nums[j]==nums[i]){
                j++;
            }
            f(nums, j,path, size, ans);
            for(;i<j;i++){
                path[size++]=nums[i];
                f(nums, j,path, size, ans);
            }

        }

    }
}
