class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        dic={}
        result = []
        for i in nums:
            if i in dic:
                dic[i] += 1
            else:
                dic[i] = 1
        newdic = sorted(dic.items(), key = lambda x:x[1])
        newdic = list(newdic)
        j = 1
        for i in reversed(newdic):
            if j <=k:
                result.append(i[0])
            j+=1
        return result
        