class Solution:
    def myAtoi(self, s: str) -> int:
        # Remove leading whitespace
        s = s.lstrip()
        
        if not s:
            return 0
        
        # Initialize variables
        sign = 1
        result = 0
        i = 0
        
        # Check for sign
        if s[i] == '-':
            sign = -1
            i += 1
        elif s[i] == '+':
            i += 1
        
        # Convert digits to integer
        while i < len(s) and s[i].isdigit():
            digit = int(s[i])
            # Check for overflow
            if result > (2**31 - 1) // 10 or (result == (2**31 - 1) // 10 and digit > 7):
                return 2**31 - 1 if sign == 1 else -2**31
            result = result * 10 + digit
            i += 1
        
        return sign * result
