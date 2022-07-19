

int missingNumber(int* nums, int numsSize){
    int p = 0;
    int *count = (int *) malloc((numsSize+1)*sizeof(int));
    for(int i = 0; i <= numsSize; i++){
        count[i] = 0;
    }
    for(int i = 0; i < numsSize; i++){
        count[nums[i]]++;
    }
    for(int i = 0; i <= numsSize; i++){
        if(count[i] == 0){
            p = i;
            break;
        }
    }
    return p;
    
}