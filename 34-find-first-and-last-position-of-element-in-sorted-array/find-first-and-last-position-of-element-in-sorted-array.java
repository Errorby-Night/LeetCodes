class Solution {

    public int binLeft(int nums[], int target){
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }

    public int binRight(int nums[], int target){
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = binLeft(nums, target);
        int right = binRight(nums, target);
        int range[] = {-1, -1};
        if(left <= right){
            range[0] = left;
            range[1] = right;
        }
        return range;
    }
}