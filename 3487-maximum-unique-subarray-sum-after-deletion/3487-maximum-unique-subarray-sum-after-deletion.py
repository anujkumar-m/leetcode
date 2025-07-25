class Solution(object):
    def maxSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=0
        m=max(nums)
        nums=set(nums)
        for i in nums:
            if i>0:
                n+=i
        return n if n!=0 else m