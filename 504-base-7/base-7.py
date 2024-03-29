class Solution:
    def convertToBase7(self, num: int) -> str:
        if num >= 0 and num < 7:
            return str(num)
        mul = 1
        if num < 0:
            mul = -1
            num *= mul
        s = ''
        while num > 0:
            s = s + str(num % 7)
            num //= 7
        s = s[::-1]
        if mul == -1:
            s = '-' + s
        return s