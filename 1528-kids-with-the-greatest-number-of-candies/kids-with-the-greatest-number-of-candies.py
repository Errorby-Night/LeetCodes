class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        result = list()
        max_candies = max(candies)
        for i in candies:
            if i + extraCandies >= max_candies:
                result.append(True)
            else:
                result.append(False)
        return result
        