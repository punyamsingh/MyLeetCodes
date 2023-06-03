class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, ArrayList<Integer>> office = new HashMap<>();
        for (int i=0; i<n; i++){
            office.putIfAbsent(manager[i], new ArrayList<>());
            office.getOrDefault(manager[i], new ArrayList<>()).add(i);
        }
        return calctime(office, headID, informTime);
    }

    int calctime(Map<Integer, ArrayList<Integer>> office, int curHead, int[] informTime){
        if (!office.containsKey(curHead)) return 0;
        int m=0;
        for (int emp: office.get(curHead)) m=Math.max(m, calctime(office, emp, informTime));
        return informTime[curHead]+m;
    }
}
