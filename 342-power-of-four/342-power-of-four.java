class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)
            return true;
        boolean f = false;
        if(n%4 == 0){
            for(int i = n; i >=1;){
                if(i == 1){
                    f = true;
                    break;
                }
                if(i%4==0)
                    i = i/4;
                else
                    break;
            }
        }
        return f;
    }
}