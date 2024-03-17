class Solution {
    public int largestAltitude(int[] gain) {
        int m=0, cur=0;
        for (int i:gain){
            cur=cur+i;
            m=Math.max(m,cur);
        }
        return m;
    }
}
