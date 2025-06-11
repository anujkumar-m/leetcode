class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ln=len(nums)
        for i in range(ln):
            nums.append(nums[i])
        return nums