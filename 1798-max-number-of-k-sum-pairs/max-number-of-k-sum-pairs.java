class Solution {
    public int maxOperations(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1)
            return 0;
        Arrays.sort(nums);
        if(nums[0] > k)
            return 0;
        int i = 0, j = nums.length - 1, count = 0;
        while(i < j){
            if(nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] < k)
                i++;
            else
                j--;
        }
        return count;
    }
}