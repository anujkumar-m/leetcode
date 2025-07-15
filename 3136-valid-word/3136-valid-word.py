class Solution(object):
    def isValid(self, word):
        """
        :type word: str
        :rtype: bool
        """
        vow=['a','e','i','o','u','A','E','I','O','U']
        if not word.isalnum() or len(word)<3:
            return False
        l,c,v,n=0,0,0,0
        for i in word:
            n+=1 if i.isdigit() else 0
            c+=1 if i.isalpha() and i not in vow else 0
            v+=1 if i in vow else 0
        print(n+c+v)
        return n+c+v>=3 and v>=1 and c>=1
           
