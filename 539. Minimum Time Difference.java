import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] times = new int[n];
        int j = 0;
        
        // Convert time points to minutes
        for (String time : timePoints) {
            int hours = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
            int minutes = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
            times[j++] = hours * 60 + minutes;
        }
        
        // Sort the times
        Arrays.sort(times);
        
        // Initialize minimum difference to a large value
        int minDifference = Integer.MAX_VALUE;
        
        // Calculate differences between consecutive times
        for (int i = 1; i < n; i++) {
            minDifference = Math.min(minDifference, times[i] - times[i - 1]);
        }
        
        // Check the difference between the last and first time (circular difference)
        minDifference = Math.min(minDifference, (1440 - times[n - 1] + times[0]));
        
        return minDifference;
    }
}
