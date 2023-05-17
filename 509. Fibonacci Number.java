class Solution {
    public int fib(int n) {
        switch (n){
            case 0: return 0;
            case 1: return 1;
            case 2: return 1;
            case 3: return 2;
        }
        return 2*fib(n-2)+fib(n-3);
    }
}
