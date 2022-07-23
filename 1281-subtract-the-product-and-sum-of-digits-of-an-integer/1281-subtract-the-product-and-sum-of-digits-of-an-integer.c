

int subtractProductAndSum(int n){
    int prod = 1, sum = 0;
    for(int i = n; i!=0; i/=10){
        prod*= i%10;
        sum+=i%10;
    }
    return (prod-sum);
}