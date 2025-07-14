class Solution(object):
    def reverseDegree(self, s):
        """
        :type s: str
        :rtype: int
        """
        sum=0
        i=0
        for j in s:
            i=i+1
            sum+=i*(123-ord(j))
        return sum

        