class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1)
            return 0;
        
        int maxReach = nums[0];
        int jumps = 1;
        int stepsLeft = nums[0];
        
        for (int i = 1; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            stepsLeft--;
            if (stepsLeft == 0) {
                jumps++;
                stepsLeft = maxReach - i;
            }
        }
        
        return jumps;
    }
}
