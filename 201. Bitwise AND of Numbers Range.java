class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int k=0;
        while (right!=left){
            right>>=1;
            left>>=1;
            k++;
        }
        return right<<k;
    }
}
