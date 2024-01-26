class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maj = nums[0]
        count = 1
        for i in range(len(nums)):
            if maj == nums[i]:
                count += 1
            else:
                count -= 1
                if count == 0:
                    count = 1
                    maj = nums[i]
        return maj