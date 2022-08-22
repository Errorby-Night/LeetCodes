class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1)
            return true;
        boolean f = false;
        if(n%2 == 0){
            for(int i = n; i >=1;){
                if(i == 1){
                    f = true;
                    break;
                }
                if(i%2==0)
                    i = i/2;
                else
                    break;
            }
        }
        return f;
    }
}