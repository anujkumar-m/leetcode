class Solution(object):
    def thousandSeparator(self, n):
        """
        :type n: int
        :rtype: str
        """
        t=str(n)
        t=t[::-1]
        s='.'.join(t[i:i+3] for i in range(0,len(t),3))
        return s[::-1]
