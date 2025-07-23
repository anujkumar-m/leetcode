class Solution(object):
    def printVertically(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        s=s.split()
        n=len(max(s,key=len))
        ln=len(s)
        st=[]
        for i in range(ln):
            if len(s[i])<n:
                t=s[i]+" "*(n-len(s[i]))
                s[i]=t
        for i in range(n):
            t=""
            for j in range(ln):
                t+=s[j][i]
            t=t.rstrip()
            st.append(t)
        return st
        