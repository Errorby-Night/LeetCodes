

int numIdenticalPairs(int* nums, int numsSize){
    int n = numsSize, c = 0;
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            if(i<j && nums[i] == nums[j])
                c++;
        }
    }
    return c;
}