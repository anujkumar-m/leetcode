class Solution(object):
    def reverseBits(self, n):
        """
        :type n: int
        :rtype: int
        """
        binary = format(n, '032b')
        binary = binary[::-1]
        decimal = int(binary, 2)
        return decimal