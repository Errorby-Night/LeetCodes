class Solution {

    public int sums(int n){
        return n * (n + 1) / 2;
    }

    public int pivotInteger(int n) {
        if(n == 1)
            return 1;
        int i = n-1, j = n;
        while(sums(i) >= (sums(j) - sums(i - 1))){
            if(sums(i) == (sums(j) - sums(i - 1)))
                return i;
            else
                i--;
        }
        return -1;
    }
}