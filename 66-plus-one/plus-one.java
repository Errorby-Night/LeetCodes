class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        int l = digits.length;
        List<Integer> al = new ArrayList<>();
        for(int i = l-1; i >= 0; i--){
            digits[i] += c;
            if(digits[i] > 9){
                digits[i] = 0;
            }
            else
                c = 0;
            al.add(digits[i]);
        }
        if(c > 0)
            al.add(c);
        int x = 0;
        int digit[] = new int[al.size()];
        for(int i = al.size()-1; i >= 0; i--)
            digit[x++] = al.get(i);
        return digit;
    }
}