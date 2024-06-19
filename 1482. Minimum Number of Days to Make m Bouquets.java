class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if ((long)m*k > n) return -1;
        int lowerBound=Integer.MAX_VALUE;
        int higherBound=0;
        for (int day : bloomDay) {
            lowerBound = Math.min(lowerBound, day);
            higherBound = Math.max(higherBound, day);
        }
        
        while (lowerBound <= higherBound) {
            int mid = (lowerBound + higherBound) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                higherBound = mid - 1;
            } else {
                lowerBound = mid + 1;
            }
        }

        return lowerBound;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0, flowers = 0;
        for (int day : bloomDay) {
            if (day <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;  // Reset flowers count after making a bouquet
                }
            } else {
                flowers = 0;  // Reset flowers count if the current bloom day exceeds the allowed days
            }
        }
        return bouquets >= m;
    }
}
