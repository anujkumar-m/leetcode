class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        k -= 1;
        while(i < k){
            char temp = s.charAt(i);
            str.setCharAt(i, s.charAt(k));
            str.setCharAt(k, s.charAt(i));
            k--;
            i++;
        }
        return str.toString();
    }
}