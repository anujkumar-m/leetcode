class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        num=set()
        n=[]
        for i in nums:
            if i in num:
                n.append(i)
            else:
                num.add(i)
        return n