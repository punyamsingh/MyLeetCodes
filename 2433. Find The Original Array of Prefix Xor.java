class Solution {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        int c=0;
        for (int i=1; i<pref.length; i++){
            c^=ans[i-1];
            ans[i] = pref[i]^c;
        }
        return ans;
    }
}
