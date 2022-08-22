class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if(n == 0)
            return 0;
        int tot = 0;
        for(int i = 0; i < n-1;i++)
            tot+=Math.min(timeSeries[i+1] - timeSeries[i], duration);
        return tot+duration;
    }
}