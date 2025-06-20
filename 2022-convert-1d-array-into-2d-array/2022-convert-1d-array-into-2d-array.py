class Solution(object):
    def construct2DArray(self, original, m, n):
        """
        :type original: List[int]
        :type m: int
        :type n: int
        :rtype: List[List[int]]
        """
        if len(original) != m * n:
            return []
        c=0
        res=[]
        for i in range(m):
            s=[]
            for j in range(n):
                s.append(original[c])
                c+=1
            res.append(s)
        return res