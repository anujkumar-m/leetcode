class Solution {
    public int expand(String s,int l, int r){
        while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l -1;
    }

    public String longestPalindrome(String s) {
        int len = 0, ind = 0;
        for(int i = 0;i < s.length(); i++){
            int c1 = expand(s,i,i);
            int c2 = expand(s,i,i+1);
            c1 = (c1 > c2) ? c1 : c2;
            if(c1 > len){
                len = c1;
                ind = i - (len - 1) / 2;
            }
        }
        return s.substring(ind,ind+len);
    }
}