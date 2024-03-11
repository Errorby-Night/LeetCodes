class Solution {
        public int[] countBits(int num) {
        if(num<0) return new int[0];
        int[] count = new int[num+1];
        for(int i=1; i<=num; i++){
            if((i&1)==1){ // odd
                count[i] = count[i-1]+1;
            } else { // even
                count[i] = count[i>>1];
            }
        }
        return count;
    }
}