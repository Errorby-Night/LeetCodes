class Solution {
    public int squaresum(int n){
        int sum = 0;
        for(int i = n; i > 0; i/=10){
            int t = i%10;
            sum+=t*t;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        if(n == 1)
            return true;
        int sum1 = n;
        int sum2 = squaresum(n);
        while(sum2!=1 && sum1!=sum2){
            sum1 = squaresum(sum1);
            sum2 = squaresum(squaresum(sum2));
        }
        return sum2==1;
    }
}