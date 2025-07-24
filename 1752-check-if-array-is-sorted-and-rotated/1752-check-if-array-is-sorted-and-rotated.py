class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        s=sorted(nums)
        for i in range(len(nums)):
            t=nums[i:]+nums[:i]
            if t==s:
                return True
        return False