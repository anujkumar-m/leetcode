class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """
        add=""
        for i in address:
            if i=='.':
                add+='['+i+']'
            else:
                add+=i
        return add