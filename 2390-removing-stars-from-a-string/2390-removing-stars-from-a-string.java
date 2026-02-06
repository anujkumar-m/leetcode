class Solution {
    public String removeStars(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = 0;
        int n = s.length();
        while(r < n){
            if(ch[r] != '*'){
                ch[l] = ch[r];
                l++;
                r++;
            }
            else{
                r++;
                l--;
            }
        }
        return new String(ch,0,l);
    }
}