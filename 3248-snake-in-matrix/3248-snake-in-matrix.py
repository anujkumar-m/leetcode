class Solution(object):
    def finalPositionOfSnake(self, n, commands):
        """
        :type n: int
        :type commands: List[str]
        :rtype: int
        """
        c=0
        for i in commands:
            if i=="DOWN":
                c+=n
            elif i=="RIGHT":
                c+=1
            elif i=="UP":
                c-=n
            elif i=="LEFT":
                c-=1
        return c
