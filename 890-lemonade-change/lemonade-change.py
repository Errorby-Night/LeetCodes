class Solution(object):
    def lemonadeChange(self, bills):
        """
        :type bills: List[int]
        :rtype: bool
        """
        five_count = 0
        ten_count = 0
        for i in bills:
            if i == 5:
                five_count += 1
            elif i == 10:
                if five_count > 0:
                    five_count -= 1
                    ten_count += 1
                else:
                    return False
            else:
                if five_count > 0 and ten_count > 0:
                    ten_count -= 1
                    five_count -= 1 
                elif five_count > 2:
                    five_count -= 3
                else:
                    return False
        return True