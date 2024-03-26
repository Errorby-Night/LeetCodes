#class Solution:
#    def firstMissingPositive(self, nums: List[int]) -> int:
#        nums = set(nums)
#        nums1 = set(range(1,len(nums)+2))
#        nums1.difference_update( nums )
#        return min(nums1)

with open("user.out", 'w') as f:

    for line in stdin:

        nums = set(map(int, line.rstrip()[1:-1].split(',')))
        nums1 = set(range(1,len(nums)+2))
        nums1.difference_update( nums )
        
        f.write(f"{min(nums1)}\n")

exit(0)