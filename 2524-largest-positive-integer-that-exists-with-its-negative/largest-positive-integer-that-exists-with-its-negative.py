class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        nums.sort()
        i, j = 0 , len(nums) - 1
        if nums.count(nums[0]) == len(nums):
            return -1
        while i < j:
            if abs(nums[i]) == nums[j] and nums[i] != abs(nums[i]):
                return nums[j]
            elif abs(nums[i]) < nums[j]:
                j -= 1
            elif abs(nums[i]) > nums[j]:
                i += 1
        return -1