

int xorOperation(int n, int start){
    int *nums = (int *)malloc(n * sizeof(int));
    nums[0] = start + (2 * 0);
    int xor = nums[0];
    for(int i = 1; i < n; i++){
        nums[i] = start + (2 * i);
        xor = xor ^ nums[i];
    }
    return xor;
}