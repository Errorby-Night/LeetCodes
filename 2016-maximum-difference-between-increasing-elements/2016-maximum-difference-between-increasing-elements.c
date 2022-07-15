int max(int a, int b){
    if(a>b)
        return a;
    else
        return b;
}

int mini(int a, int b){
    if(a<b)
        return a;
    else
        return b;
}
int maximumDifference(int* nums, int numsSize){
    int min = nums[0], ans = -1;
    for(int i = 1; i < numsSize; i++){
        if(nums[i] > min)
            ans = max(ans, nums[i] - min);
        min = mini(min, nums[i]);
    }
    return ans;
}