class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        for (int number : nums){
            map.put(number, 1+map.getOrDefault(number,0));
        }
        
        Integer[] valuesArray = map.values().toArray(new Integer[0]);
        Integer[] keyArray = map.keySet().toArray(new Integer[0]);
        
        for (int i = 1; i < valuesArray.length; i++) {
            int keyv = valuesArray[i];
            int keyk = keyArray[i];
            int j = i - 1;
            while (j >= 0 && valuesArray[j] < keyv) {
                valuesArray[j + 1] = valuesArray[j];
                keyArray[j+1] = keyArray[j];
                j--;
            }            
            valuesArray[j + 1] = keyv;
            keyArray[j + 1] = keyk;
        }

        int[] l = new int[k];
        for (int i=0; i<k; i++){
            l[i]=keyArray[i];
        }
        return l;
    }
}
