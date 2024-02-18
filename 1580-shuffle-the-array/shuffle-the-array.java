class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shf[] = new int[2 * n];
        int k = n, l = 0;
        for(int i = 0; i < 2*n - 1; i+=2){
            shf[i] = nums[l++];
            shf[i + 1] = nums[k++];
        }
        return shf;
    }
}