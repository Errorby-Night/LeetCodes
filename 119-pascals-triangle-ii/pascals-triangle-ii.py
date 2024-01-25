class Solution(object):
    def getRow(self, row):
        result = []
        start = 1
        result.append(start)
        for i in range(row):
            start *= (row - i)
            start //= (i + 1)
            result.append(start)
        return result
        