class Solution(object):
    def shiftingLetters(self, s, shifts):
        """
        :type s: str
        :type shifts: List[int]
        :rtype: str
        """
        s=s[::-1]
        shifts=shifts[::-1]
        n=0
        t=""
        c=""
        for i in range(len(s)):
            n+=shifts[i]
            c = (ord(s[i]) - ord('a') + n) % 26 + ord('a')
            t+=chr(c)
        return t[::-1]