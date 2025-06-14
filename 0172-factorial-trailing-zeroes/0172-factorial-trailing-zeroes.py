class Solution(object):
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """
        c=0
        t=1
        for i in range(1,n+1,1):
            t*=i
        while t%10==0:
            c+=1
            t//=10
        return c
        