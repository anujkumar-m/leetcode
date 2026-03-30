class Solution {
    public boolean isPalindrome(int x) {
        int a = 0;
        int org = x, rev = 0;
        if (x < 0)
            return false;
        while (x != 0) {
            a = x % 10;
            rev = rev * 10 + a;
            x /= 10;
        }
        if (org == rev) {
            return true;
        } else
            return false;
    }
}