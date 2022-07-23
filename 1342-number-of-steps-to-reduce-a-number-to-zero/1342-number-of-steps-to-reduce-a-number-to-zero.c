

int numberOfSteps(int num){
    int s = 0;
    for(int i = num; i >=0;){
        if(i == 0)
            return s;
        if(i%2 == 0){
            s++;
            i=i/2;
        }
        else{
            i--;
            s++;
        }
    }
    return s;
}