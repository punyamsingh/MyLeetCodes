class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum=duration;
        for (int t=0; t<timeSeries.length-1; t++){
            sum+=duration;
            if (timeSeries[t+1]-timeSeries[t] < duration) 
                sum-=(duration-timeSeries[t+1]+timeSeries[t]);            
        }
        return sum;
    }
}
