class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            int index = Math.abs(nums[i]);
            if(nums[index] < 0)
                return Math.abs(nums[i]);
            nums[index] = -nums[index];
        }
        return -1;
    }
}