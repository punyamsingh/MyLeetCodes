class Solution {
    public int tribonacci(int n) {
        switch (n){
            case 0: return 0;
            case 1: return 1;
            case 2: return 1;
            case 3: return 2;
            case 4: return 4;
        }
        return 2*tribonacci(n-2)+2*tribonacci(n-3)+tribonacci(n-4);
    }
}
