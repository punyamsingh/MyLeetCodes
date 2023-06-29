class Solution {
    public String longestPalindrome(String s) {
        String sub="";
        int l,m=0,r;
        for (int i=0; i<s.length(); i++){
            l=i;
            r=i+1;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if (m < (r-l+1)){
                    m=r-l+1;
                    sub = s.substring(l,r+1);
                }
                l--;
                r++;
            }
            
            l=i;
            r=i;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if (m < (r-l+1)){
                    m=r-l+1;
                    sub = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        return sub;
    }
}
