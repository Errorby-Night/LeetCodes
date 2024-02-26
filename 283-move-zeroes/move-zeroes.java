class Solution {
    
    public int getNonZero(int[] nums, int n){
        while(n < nums.length){
            if(nums[n] != 0)
                break;
            n++;
        }
        if(n >= nums.length)
            return -1;
        return n;
    }

    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int non = getNonZero(nums, i);
            if(nums[i] == 0 && non != -1){
                nums[i] = nums[non];
                nums[non] = 0;
            }
        }
    }
}