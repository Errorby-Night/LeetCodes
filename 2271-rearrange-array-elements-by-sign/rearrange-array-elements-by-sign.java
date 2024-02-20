class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int x[] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }
        int j=0, k=0;
        for(int i = 0; i < nums.length; i++){
            if(i%2==0)
                x[i] = pos.get(j++);
            else
                x[i] = neg.get(k++);
        }
        return x;
    }
}