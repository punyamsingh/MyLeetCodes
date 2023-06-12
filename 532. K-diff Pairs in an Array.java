class Solution {
    public int findPairs(int[] nums, int k) {
        if (k==0){
            int c=0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i: nums){
                map.compute(i, (key, value) -> {
                    if (value == null) return 1;
                    else return value+1;
                });
                if (map.get(i)==2) c++;
            }
            return c;
        }
        List<Integer> l = new ArrayList<Integer>();
        for (int i: nums){
            l.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i: l){
            if (!map.containsKey(i)){
                if (l.contains(i+k)){
                    map.put(i,i+k);
                }
                if (l.contains(i-k)){
                    map.put(i-k,i);
                }
            }
        }
        return map.size();
    }
}
