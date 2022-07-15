int max(int a, int b){
    if(a>b)
        return a;
    else
        return b;
}

int mini(int a, int b){
    if(a<b)
        return a;
    else
        return b;
}
int maxProfit(int* prices, int pricesSize){
    int min = prices[0], profit = 0;
    for(int i = 1; i < pricesSize; i++){
        min = mini(min, prices[i]);
        profit = max(profit, prices[i] - min);
    }
    return profit;
}