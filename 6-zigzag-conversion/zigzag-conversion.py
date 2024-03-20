class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        
        a = numRows * 2 - 2
        if numRows == 1:
            a = 1
        arr = [''] * numRows
        for i in range(len(s)):
            arr[abs(numRows - 1 - (i % a)) % numRows] += s[i]
        res = ''
        for i in range(numRows):
            res += arr[abs(numRows - 1 - (i % a)) % numRows]
        return res

