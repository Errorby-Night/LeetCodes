

int minPartitions(char * n){
    int max = 0, a = 0;
    for(int i = 0; i < strlen(n); i++)
        if((n[i] - '0') > max)
            max = n[i] - '0';
    return max;
}