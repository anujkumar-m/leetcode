class Solution(object):
    def findFinalValue(self, nums, k):
        """
        :type nums: List[int]
        :type original: int
        :rtype: int
        """
        while k in nums:
            k=k*2
        return k