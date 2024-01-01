class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gstart=0;
        int sstart=0;
        while (sstart<s.length && gstart<g.length){
            if (s[sstart] >= g[gstart]) gstart++;
            sstart++;
        }
        return gstart;
    }
}
