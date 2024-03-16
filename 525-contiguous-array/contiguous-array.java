class Solution {
    public int findMaxLength(int[] nums) {
        int zeroes = 0, ones = 0;
        int max_length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                zeroes++;
            else
                ones++;
            int diff = zeroes - ones;

            if(map.containsKey(diff)){
                max_length = Math.max(max_length, i - map.get(diff));
            }
            else
                map.put(diff, i);
        }
        return max_length;
    }
}