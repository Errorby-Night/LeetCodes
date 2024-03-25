class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []
        dicts = {}
        for i in nums:
            if i in dicts:
                dicts[i] += 1
            else:
                dicts[i] = 1
            if dicts[i] == 2:
                result.append(i)

        return result