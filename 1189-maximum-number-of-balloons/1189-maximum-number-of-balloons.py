class Solution(object):
    def maxNumberOfBalloons(self, text):
        """
        :type text: str
        :rtype: int
        """
        b,a,l,o,n=text.count("b"),text.count("a"),text.count("l")//2,text.count("o")//2,text.count("n")
        return min(b,a,l,o,n)