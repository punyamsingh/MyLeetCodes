import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int hIndexCandidate = n - i; // Number of papers with at least citations[i] citations
            if (citations[i] >= hIndexCandidate) {
                return hIndexCandidate;
            }
        }

        return 0;
    }
}
