class Solution(object):
    def arraySign(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=1
        if 0 in nums:
            return 0
        for i in nums:
            n*=i
        return 1 if n>0 else(-1 if n<0 else 0) 