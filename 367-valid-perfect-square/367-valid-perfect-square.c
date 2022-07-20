

bool isPerfectSquare(int num){
    int flag = -1;
    unsigned int i = 1;
    do{
        if(num%i == 0 && (num/i) == i)
            flag = 1;
        i++;
    }while(i*i <= num);
    return (flag == 1);
}