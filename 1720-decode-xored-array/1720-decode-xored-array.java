class Solution {
    public int[] decode(int[] encoded, int first) {
        int l = encoded.length;
        int decode[] = new int[l+1];
        decode[0] = first;
        for(int i = 0; i < l; i++){
            decode[i+1] = decode[i] ^ encoded[i];
        }
        return decode;
    }
}