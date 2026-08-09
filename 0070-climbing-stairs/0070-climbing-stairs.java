class Solution {
    static int[] f = new int[46];
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        if (f[n] != 0)
            return f[n];

        f[n] = climbStairs(n - 1) + climbStairs(n - 2);

        return f[n];
    }
}