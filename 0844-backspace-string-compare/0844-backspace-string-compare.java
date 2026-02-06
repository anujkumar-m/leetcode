class Solution {
    public String removeString(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = 0;
        int n = s.length();
        while(r < n){
            if(ch[r] != '#'){
                ch[l] = ch[r];
                l++;
                r++;
            }
            else{
                r++;
                if(l > 0)
                l--;
            }
        }
        return new String(ch,0,l);
    }
    public boolean backspaceCompare(String s, String t) {
        String str1 = removeString(s);
        String str2 = removeString(t);
        System.out.print(str1);
        return str1.equals(str2);
    }
}