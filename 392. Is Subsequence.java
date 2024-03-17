class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        if (sc.length==0) return true;
        if (sc.length>tc.length) return false;
        int find=0;
        for (char look: tc){
            if (sc[find]==look) find++;
            if (find==sc.length) return true;
        }
        return false;
    }
}
