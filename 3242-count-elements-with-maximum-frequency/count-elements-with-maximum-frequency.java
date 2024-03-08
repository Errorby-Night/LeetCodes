class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int count[] = new int[max + 1];
        for(int i = 0; i < nums.length; i++)
            count[nums[i]]++;
        Arrays.sort(count);
        int c = 1;
        for(int i = max - 1; i >=0; i--)
            if(count[max] == count[i])
                c++;
            else
                break;
        return count[max] * c;
        
        
    }
}