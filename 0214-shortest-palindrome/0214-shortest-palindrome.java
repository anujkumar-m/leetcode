class Solution {
    public String shortestPalindrome(String s) {
        String temp = new StringBuilder(s).reverse().toString();

        for(int i = 0; i < s.length(); i++){
            if(s.startsWith(temp.substring(i)))
                return temp.substring(0,i) + s;

        }
        return temp + s;
    }
}

