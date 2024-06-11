class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i: arr1){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int index=0;

        int k=0;
        while (k<arr2.length){
            int ark=arr2[k];
            while (map.get(ark) > 0){
                arr1[index++]=ark;
                map.put(ark, map.get(ark)-1);
            }
            k++;
        }
        PriorityQueue<Integer> emp = new PriorityQueue<Integer>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int v=entry.getValue();
            while (v-->0){
                emp.add(entry.getKey());
            }
        }
        while (!emp.isEmpty()){
            arr1[index++]=emp.poll();
        }
        return arr1;
    }
}
