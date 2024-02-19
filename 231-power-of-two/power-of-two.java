class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
            return false;
        if(n == 1)
            return true;
        int c = 0;
        int x = n;
        while(n%2 == 0){
            c++;
            n /= 2;
        }
        return Math.pow(2, c) == x;
    }
}