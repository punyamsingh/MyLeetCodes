class Solution {
    public int maxScore(String s) {
        char[] arr = s.toCharArray();
        int ans=0, m=0;
        for (char ch: arr) if (ch=='1') ans++;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]=='0') ans++;
            else ans--;
            m=Math.max(m,ans);
        }
        return m;
    }
}
