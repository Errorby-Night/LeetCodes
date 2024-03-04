class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int p = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != p)
                nums[k++] = nums[i];
            p = nums[i];
        }
        return k;
    }
}