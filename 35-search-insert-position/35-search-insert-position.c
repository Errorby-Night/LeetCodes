

int searchInsert(int* nums, int numsSize, int target){
    int pick, left = 0, right = numsSize - 1;
    while(right >= left){
        pick = left + (right - left) / 2;
        if(nums[pick] == target)
           return pick;
        else if(target > nums[pick])
            left = pick + 1;
        else
            right = pick - 1;
    }
    return left;
}