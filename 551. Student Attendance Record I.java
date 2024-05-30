class Solution {
    public boolean checkRecord(String s) {
        int l=0;
        int a=0;
        for (char c: s.toCharArray()){
            if (c=='L') l++;
            else{
                l=0;
                if (c=='A') a++;
            }
            if (l>=3 || a>=2) return false;
        }
        return true;
    }
}
