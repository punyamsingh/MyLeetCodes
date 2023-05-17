class Solution {
    public int climbStairs(int n) {
        switch (n){
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
        }
        return 2*climbStairs(n-2)+climbStairs(n-3);
    }
}
