class Solution(object):
    def twoOutOfThree(self, nums1, nums2, nums3):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :type nums3: List[int]
        :rtype: List[int]
        """
        nums1, nums2, nums3=set(nums1),set(nums2),set(nums3)
        num=list(nums1)+list(nums2)+list(nums3)
        lst=[]
        for i in set(num):
            if num.count(i)>=2:
                lst.append(i)
        return lst