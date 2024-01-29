class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s = s.lower()
        t = t.lower()
        count_s  = [0] * 26
        count_t  = [0] * 26
        i = 0
        while i < len(s):
            count_s[ord(s[i]) - 97] += 1
            i += 1
        i = 0
        while i < len(t):
            count_t[ord(t[i]) - 97] += 1
            i += 1
        i = 0
        j = 0
        if len(s) == len(t):
            return count_s == count_t
        elif len(s) > len(t)  or len(t) > len(s):
            return False
        