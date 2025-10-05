class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        binary = bin(num)[2:] 
        complement = "".join('1' if bit == '0' else '0' for bit in binary)
        n= int(complement, 2)
        return n