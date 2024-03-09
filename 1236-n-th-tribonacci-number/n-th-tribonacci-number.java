class Solution {
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        int meme[] = new int[n + 1];
        meme[1] = 1;
        meme[2] = 1;
        for(int i = 3; i < meme.length; i++)
            meme[i] = meme[i - 1] + meme[i - 2] + meme[i - 3];
        return meme[n];
    }
}