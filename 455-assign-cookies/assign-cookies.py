class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        count = 0
        i = 0
        s.sort()
        g.sort()
        while(count < len(g) and i < len(s)):
            if s[i] >= g[count]:
                count += 1
            i += 1
        return count