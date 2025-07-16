class Solution(object):
    def numDifferentIntegers(self, word):
        """
        :type word: str
        :rtype: int
        """
        num=[]
        n=""
        for i in word:
            if i.isdigit():
                n+=i
            elif n!='':
                num.append(int(n))
                n=""
        if n!='':
            num.append(int(n))
        return len(set(num))