class Solution(object):
    def replaceWords(self, d, s):
        """
        :type dictionary: List[str]
        :type sentence: str
        :rtype: str
        """
        d=sorted(d,key=len)
        s=s.split()
        for i in range(len(s)):
            for j in d:
                if s[i].startswith(j):
                    s[i]=j
        return ' '.join(s)