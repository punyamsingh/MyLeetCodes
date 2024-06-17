public class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right=(long)Math.ceil(Math.pow(c,0.5));
        while (left <= right) {
            long cur = left * left + right * right;
            if (cur < c) {
                left++;
            } else if (cur > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}
