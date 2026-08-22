class Solution {
    public int maxPower(String s) {
        int ans = 0;
        char prev = '0';
        int count = 1;
        for(char c : s.toCharArray()){
            if(c == prev){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                prev = c;
                count = 1;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}