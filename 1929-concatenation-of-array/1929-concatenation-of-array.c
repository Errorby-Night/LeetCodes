

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize){
    *returnSize = (2 * numsSize);
    int *ans = (int *)malloc((2 * numsSize) * sizeof(int));
    for(int i = 0; i < (2 * numsSize); i++){
        if(i >= numsSize)
            ans[i] = nums[i - numsSize];
        else
            ans[i] = nums[i];
    }
    return ans;
}