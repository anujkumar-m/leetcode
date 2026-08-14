class Solution {
    public int removePalindromeSub(String s) {
        return isPali(s) ? 1 : 2;
    }
    boolean isPali(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }
}