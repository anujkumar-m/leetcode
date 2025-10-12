class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n = (int) Math.ceil((double) b.length() / a.length());
        if((a.repeat(n)).contains(b)) 
            return n;
        else if((a.repeat(n+1)).contains(b)) 
            return n+1;
        else return -1;
    }
}