class Solution {
    public int reverse(int x) {
        int rev = 0;
        int f = 1;
        if(x < 0){
            x *= -1;
            f = -1;
        }
        while(x > 0){
            int digit = x % 10;
            
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0; // Overflow
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            rev = rev * 10 + digit;
            x/=10;

        }
        return rev * f;
    }
}