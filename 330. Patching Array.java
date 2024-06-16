class Solution {
    public int minPatches(int[] nums, int n) {
        int patches=0;
        long reach=0;
        int curindex=0;
        while (reach<n){
            if (curindex>=nums.length || nums[curindex]>(reach+1)){
                reach+=(reach+1);
                patches++;
            }
            else{
                reach+=nums[curindex];
                curindex++;
            }
        }
        return patches;

        // while (reach<n){
        //     if (curindex>=nums.length){
        //         reach+=(reach+1);
        //         patches++;
        //     }
        //     else{
        //         if (nums[curindex]<=(reach+1)){
        //             reach+=nums[curindex];
        //             curindex++;
        //         }
        //         else{
        //             reach+=(reach+1);
        //             patches++;
        //         }
                    
        //     }
        // }
        // return patches;
    }
}
