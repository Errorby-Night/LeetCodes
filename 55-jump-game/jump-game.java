class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 0)
            return false;
        if(nums.length == 1) 
            return true;
        int maxReach = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxReach)
                return false;
            maxReach = Math.max(maxReach, i + nums[i]);
            if(maxReach >= nums.length - 1)
                return true;
        }
        return false;
    }
}