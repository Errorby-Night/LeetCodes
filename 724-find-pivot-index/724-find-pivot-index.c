

int pivotIndex(int* nums, int numsSize){
    int sum = 0, leftsum = 0;
    for(int i = 0; i < numsSize; i++){sum+=nums[i];}
    for(int i = 0; i < numsSize; i++){
        if(sum - leftsum - nums[i] == leftsum){return i;}
        leftsum += nums[i];
    }
    return -1;
}