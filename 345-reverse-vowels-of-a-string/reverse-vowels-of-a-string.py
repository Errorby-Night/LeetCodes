class Solution(object):
    def isVowel(self, a):
        l = 'AEIOUaeiou'
        return a in l

    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = list(s)
        f = 0
        l = len(s) - 1
        while(f <= l):
            if(self.isVowel(result[f])):
                if(self.isVowel(result[l])):
                    result[f], result[l] = result[l], result[f]
                    f = f + 1
                    l = l - 1
                else:
                    l = l - 1
            else:
                f = f + 1
        strs = "".join(result)
        return strs
        