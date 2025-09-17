class Solution(object):
    def mostFrequentEven(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_count = 0   
        n = -1          
        for i in nums:
            if i % 2 == 0:
                count_i = nums.count(i)   
                if count_i > max_count or (count_i == max_count and i < n) or n == -1:
                    max_count = count_i
                    n = i
        return n
