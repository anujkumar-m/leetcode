class Solution(object):
    def diagonalPrime(self, nums):
        """
        :type nums: List[List[int]]
        :rtype: int
        """
        def isprime(num):
            if num <= 1:
                return False
            for i in range(2,int(num**0.5)+1):
                if num%i==0: return False
            return True
        n = len(nums)
        larg=0
        for i in range(n):
            if isprime(nums[i][i]):
                larg=max(larg,nums[i][i])
            if isprime(nums[i][n-i-1]):
                larg=max(larg,nums[i][n-i-1])
        return larg
            
        