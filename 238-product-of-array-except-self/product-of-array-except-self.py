class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        prefix = [1]
        postfix = [1]
        output = []
        mult1 = 1
        mult2 = 1
        i = 1
        j  = len(nums) - 2
        while(i  < len(nums) and j >= 0):
            mult1 *= nums[i-1]
            prefix.append(mult1)
            i += 1

            mult2 *= nums[j + 1]
            postfix.append(mult2)
            j -= 1
        postfix = postfix[::-1]
        i, j  = 0, 0
        while i < len(nums):
            output.append(postfix[i] * prefix[i])
            i+= 1
        return output