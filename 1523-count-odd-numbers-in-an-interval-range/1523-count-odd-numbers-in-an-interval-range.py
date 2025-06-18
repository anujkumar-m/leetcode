class Solution(object):
    def countOdds(self, low, high):
        """
        :type low: int
        :type high: int
        :rtype: int
        """
        a=high-low+1
        return a//2+1 if high%2!=0 and low%2!=0 else a//2