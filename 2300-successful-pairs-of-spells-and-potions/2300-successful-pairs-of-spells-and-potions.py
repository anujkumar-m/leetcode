class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        potions.sort()
        lst=[]
        m=len(potions)
        for i in spells:
            n=float(success/i)
            idx=bisect.bisect_left(potions,n)
            lst.append(m-idx)
        return lst

