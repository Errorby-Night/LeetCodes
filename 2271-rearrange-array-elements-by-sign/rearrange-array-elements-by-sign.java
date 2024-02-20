class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x[] = new int[nums.length];
        int j = 0, k = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                x[j] = nums[i];
                j += 2;
            }
            else{
                x[k] = nums[i];
                k += 2;
            }
        }
        return x;
    }
}