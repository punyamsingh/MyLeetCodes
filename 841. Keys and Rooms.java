class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms, 0, visited);
        for(int i = 0; i < n; i++) if(!visited[i]) return false;
        return true;
    }

    public void dfs(List<List<Integer>> rooms, int nodevalue, boolean[] visited){
        visited[nodevalue]=true;
        for (int i: rooms.get(nodevalue)) if (!visited[i]) dfs(rooms, i, visited);
    }
}
