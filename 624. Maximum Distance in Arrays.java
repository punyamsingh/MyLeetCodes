class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal = arrays.get(0).get(0);  // Initialize with the first element of the first array
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);  // Initialize with the last element of the first array
        int maxDistance = 0;
        
        // Start from the second array
        for (int i = 1; i < arrays.size(); i++) {
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);
            
            // Calculate distance using current array's values and the min/max from previous arrays
            maxDistance = Math.max(maxDistance, Math.max(Math.abs(currentMax - minVal), Math.abs(maxVal - currentMin)));
            
            // Update global min and max
            minVal = Math.min(minVal, currentMin);
            maxVal = Math.max(maxVal, currentMax);
        }
        
        return maxDistance;
    }
}
