class Solution {
    public int appendCharacters(String s, String t) {
        if(s.equals(t))
            return 0;
        int j=0;
        int tl=t.length();
        for (char c: s.toCharArray()){
            if (j>=tl) return 0;
            if (c==t.charAt(j)) j++;
        }
        return tl-j;
    }
}
