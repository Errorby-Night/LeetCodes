class Solution {
    public int pivotIndex(int[] nums) {
        int l = nums.length, sum = 0, lsum = 0;
        for(int i = 0; i < l; i++){sum+=nums[i];}
        for(int i = 0; i < l; i++){
            if(sum - lsum - nums[i] == lsum)
                return i;
            lsum+=nums[i];
        }
        return -1;
    }
}