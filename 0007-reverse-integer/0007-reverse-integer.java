class Solution {
    public int reverse(int x) {
        long n = 0;
        int c = (int) Math.pow(2.0, 31.0) - 1;
        // if (x >= c)
        //     return 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        if (n > c || n < (-c))
            return 0;
        return (int) n;
    }
}