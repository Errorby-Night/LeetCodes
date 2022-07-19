int hammingWeight(uint32_t n) {
    int c = 0;
    for(; n !=0; n/=2)
        if(n%2 == 1)
            c++;
    return c;
}