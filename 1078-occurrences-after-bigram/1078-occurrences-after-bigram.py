class Solution(object):
    def findOcurrences(self, text, first, second):
        """
        :type text: str
        :type first: str
        :type second: str
        :rtype: List[str]
        """
        third=[]
        text=list(text.split())
        for i in range(1,len(text)-1):
            if text[i]==second and text[i-1]==first:
                third.append(text[1+i])
        return third
        