class Solution(object):
    def minSubsequence(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        t,s,m=0,0,0
        nums=sorted(nums,reverse=True)
        for i in range(len(nums)):
            t=sum(nums[:i])
            s=sum(nums[i:])
            if t>s: return nums[:i]
        return nums