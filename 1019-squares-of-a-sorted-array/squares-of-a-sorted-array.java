class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int sqr[] = new int[n];
        int i = 0, j = n-1, k = n-1;
        while(i <= j){
            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                sqr[k--] = nums[i] * nums[i];
                i++;
            }
            else{
                sqr[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return sqr;
    }
}