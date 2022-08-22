class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1)
            return true;
        boolean f = false;
        if(n%3 == 0){
            for(int i = n; i >=1;){
                if(i == 1){
                    f = true;
                    break;
                }
                if(i%3==0)
                    i = i/3;
                else
                    break;
            }
        }
        return f;
    }
}