class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        int arr[] = new int[l];
        arr[0] = nums[0];
        for(int i = 1; i < l; i++){
            arr[i] = nums[i] + arr[i-1];
        }
        return arr;
    }
}