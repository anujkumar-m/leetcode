class Solution {
    public boolean isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
        || c == 'I' || c == 'O' || c == 'U') return true;
        return false;
    }

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l=0,r = ch.length-1;
        while(l < r){
            if(!isvowel(ch[l])) l++;
            else if(!isvowel(ch[r]) ) r--;
            else{
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        return new String(ch,0,ch.length);
    }
}