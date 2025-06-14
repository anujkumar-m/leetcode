class Solution(object):
    def maxAscendingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_sum = s = nums[0]
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                s += nums[i]
            else:
                max_sum = max(max_sum, s)
                s = nums[i]
        return max(max_sum, s)
