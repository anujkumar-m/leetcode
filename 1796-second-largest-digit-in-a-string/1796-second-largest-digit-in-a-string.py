class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        n=set()
        for i in s:
            if i.isnumeric():
                n.add(int(i))
        n=list(n)
        print(n)
        return n[-2] if len(n)>=2 else -1
