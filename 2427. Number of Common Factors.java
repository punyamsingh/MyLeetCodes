class Solution {
    public int commonFactors(int a, int b) {
        int x=1;
        int ans=0;
        int c=Math.min(a,b);
        while (x<=c){
            if (a%x==0 && b%x==0) ans++;
            x++;
        }
        return ans;
    }
}
