class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp = new int[n+1];
        dp[n]=1;
        if (s.charAt(n-1)=='0') dp[n-1]=0;
        else dp[n-1]=1;
        for (int p=n-2; p>=0; p--){
            if (s.charAt(p)=='0'){
                dp[p]=0;
                continue;
            }
            dp[p]=dp[p+1];
            if (s.charAt(p)=='1' || (s.charAt(p)=='2' && s.charAt(p+1)<'7')){
                dp[p]+=dp[p+2];
            }
        }

        return dp[0];
    }
}
