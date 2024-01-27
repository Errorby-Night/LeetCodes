class Solution(object):
    def rindex(self, lst, value):
        return len(lst) - operator.indexOf(reversed(lst), value) - 1
    
    def findShortestSubArray(self, n):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = [0] * (max(n) + 1)
        for i in n:
            count[i] += 1
        mini = len(n)
        index = 0
        maxi = max(count)
        for i in range(len(count)):
            if count[i] == maxi:
                if mini > (self.rindex(n, i) - n.index(i) + 1):
                    mini = (self.rindex(n, i) - n.index(i) + 1)
        return mini
