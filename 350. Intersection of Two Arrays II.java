class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        if (nums1.length<nums2.length){
            int[] a = nums1;
            nums1 = nums2;
            nums2 = a;
        }

        for (int i: nums1){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for (int i:nums2){
            if (map.containsKey(i) && map.get(i)>0){
                l.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        int[] ans = new int[l.size()];
        for (int x=0; x<l.size(); x++){
            ans[x]=l.get(x);
        }
        return ans;
    }
}
