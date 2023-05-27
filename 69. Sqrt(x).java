class Solution {
    // Map<Integer,Integer> map = new HashMap<>();
    public int mySqrt(int x) {
        // if (x==0) return 0;
        // map.put(1,1);
        // if (map.containsKey(x)){
        //     return map.get(x);
        // }

        int low=1, high=x, ans=0;
        while (low<=high){
            int mid = (low+high)/2;
            if (x/mid == mid){
                return mid;
            }
            else if (x/mid < mid){
                high=mid-1;
            }
            else{
                low=mid+1; ans=mid;
            }
        }
        // map.put(ans, x);
        return ans;
    }
}
