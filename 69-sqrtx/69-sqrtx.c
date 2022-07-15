

int mySqrt(int x){
    long int sqrt = 0, i = 0;
    if(x == 0)
        return 0;
    if(x == 1)
        return 1;
    do{
        if(i*i <= x)
            sqrt = i;
        if(i*i >x)
            break;
        i++;
    }while(i <= (x/2));
    return sqrt;
}