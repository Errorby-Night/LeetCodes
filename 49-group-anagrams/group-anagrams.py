class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anag = {}
        for word in strs:
            sorted_word = ''.join(sorted(word))
            if sorted_word in anag:
                anag[sorted_word].append(word)
            else:
                anag[sorted_word] = [word]
            
        result = list(anag.values())
        return result