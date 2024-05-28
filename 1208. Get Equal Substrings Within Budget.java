class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] diff = new int[n];
        int maxLength = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            diff[end] = Math.abs( s.charAt(end) - t.charAt(end) );
            currentSum += diff[end];

            while (currentSum > maxCost && start <= end) {
                currentSum -= diff[start];
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
