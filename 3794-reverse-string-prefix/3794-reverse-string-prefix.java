class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while(i < k - 1){
            char temp = s.charAt(i);
            str.setCharAt(i, s.charAt(k - 1));
            str.setCharAt(k - 1, s.charAt(i));
            k--;
            i++;
        }
        return str.toString();
    }
}