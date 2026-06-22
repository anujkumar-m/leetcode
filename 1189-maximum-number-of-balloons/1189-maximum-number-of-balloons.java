class Solution {
    public int maxNumberOfBalloons(String text) {
        int a = 0, b = 0, l = 0, o = 0, n = 0;
        for(char c : text.toCharArray()){
            if(c == 'a') a++;
            else if(c == 'b') b++;
            else if(c == 'o') o++;
            else if(c == 'l') l++;
            else if(c == 'n') n++;
        } 
        return Math.min(Math.min(Math.min(Math.min(b, a), l / 2), o / 2), n);   
    }
}