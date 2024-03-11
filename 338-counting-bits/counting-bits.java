class Solution {
    public int binOne(int n){
        int a = 0;
        while(n > 0){
            if(n % 2 == 1)
                a++;
            n /= 2;
        }
        return a;
    }

    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for(int i = 0; i <= n; i++)
            ans[i] = binOne(i);
        return ans;
    }
}