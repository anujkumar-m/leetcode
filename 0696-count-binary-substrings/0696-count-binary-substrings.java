class Solution {
    public int countBinarySubstrings(String s) {
        int currCount = 1;
        int prevCount = 0;
        int ans = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currCount++;
            }
            else{
                ans+=Math.min(currCount,prevCount);
                prevCount = currCount;
                currCount = 1;
            }
        }
        ans+=Math.min(currCount,prevCount);
        return ans;
    }
}