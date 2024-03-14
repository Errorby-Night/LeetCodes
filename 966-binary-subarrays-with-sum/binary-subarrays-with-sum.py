class Solution(object):
    def numSubarraysWithSum(self, nums, goal):
        """
        :type nums: List[int]
        :type goal: int
        :rtype: int
        """
        count = {0:1}
        curr_sum = 0
        total_subarr = 0
        for i in nums:
            curr_sum += i
            if curr_sum - goal in count:
                total_subarr += count[curr_sum - goal]
            count[curr_sum] = count.get(curr_sum, 0) + 1
        return total_subarr