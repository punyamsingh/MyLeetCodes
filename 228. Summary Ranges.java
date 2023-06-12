class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<String>();
        if (nums.length <= 1){
            if (nums.length == 0) return l;
            l.add(nums[0]+"");
            return l;
        }
        int start = nums[0];
        int end = nums[0];
        int i;
        for (i=1; i<nums.length; i++){
            if (nums[i]-1==end){
                end = nums[i];
            }
            else{
                if (start==end) l.add(start+"");
                else l.add(start+"->"+end);
                start=nums[i];
                end=nums[i];
            }
        }
        if (nums[i-1]-1==end){
            end = nums[i-1];
        }
        else{
            if (start==end) l.add(start+"");
            else l.add(start+"->"+end);
            start=nums[i-1];
            end=nums[i-1];
        }
        return l;
    }
}
