class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0, gains = 0;
        for(int i = 0; i < gain.length; i++){
            gains += gain[i];
            maxAlt = Math.max(maxAlt, gains);
        }
        return maxAlt;
    }
}