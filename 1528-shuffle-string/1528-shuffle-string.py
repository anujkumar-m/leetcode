class Solution(object):
    def restoreString(self, s, indices):
        """
        :type s: str
        :type indices: List[int]
        :rtype: str
        """
        lst=dict()
        t=[]
        for i,j in zip(s,indices):
            lst[j]=i
        t=[lst[i] for i in range(len(s))]
        return ''.join(t)