class Solution:
    def maxDepth(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1 and (s != '(' or s != ')'):
            return 0
        count = 0
        max_num = 0
        for i in s:
            if i == '(':
                count += 1
                if max_num < count:
                     max_num = count
            if i == ')':
                count -= 1

        return max_num