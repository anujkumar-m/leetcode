class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (!cointainZero(i) && !cointainZero(n - i)) {
                return new int[] { i, n - i };
            }

        }
        return new int[] {};
    }

    public boolean cointainZero(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return true;
            n /= 10;
        }
        return false;

    }
}