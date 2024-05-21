class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> rad = new LinkedList<Integer>();
        Queue<Integer> dir = new LinkedList<Integer>();
        char[] ca = senate.toCharArray();
        for (int i=0; i<n; i++){
            if (ca[i]=='R') rad.add(i);
            else dir.add(i);
        }

        while (!rad.isEmpty() && !dir.isEmpty()) {
            int r = rad.poll(), d = dir.poll();
            if (r < d) rad.add(r+n);
            else dir.add(d+n);
        }

        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}
