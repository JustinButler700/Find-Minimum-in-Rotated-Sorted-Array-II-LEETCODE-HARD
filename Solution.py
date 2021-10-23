# Justin Butler 10/23/2021
# Runtime: 28 ms, faster than 99.26% of Python online submissions for Find Minimum in Rotated Sorted Array II.
# Memory Usage: 13.7 MB, less than 85.43%
# (-5000 <= nums[i] <= 5000 is a constraint of this question. so out = 5001)
class Solution(object):
    def findMin(self, nums):
        out = 5001 
        for i in nums:
            out = min(i, out)
        return out
# Alternatively we could do this as a 1 line solution by just returning min(nums)
# However, the runtime of that would be 40 ms, and faster than 61.23%
# So, this more contrived solution outperforms it.
