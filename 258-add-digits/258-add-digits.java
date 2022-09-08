class Solution {
    public int addDigits(int num) {
        int x = (num - 1) / 9;
        int sum = num - (9 * x);
        return sum;
    }
}