/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize){
    int *arr = (int *)malloc(numsSize*sizeof(int));
    *returnSize = arr;
    int sum = 0;
    for(int i = 0; i < numsSize; i++){
        sum += nums[i];
        arr[i] = sum;
    }
    *returnSize = numsSize;
    return arr;
}