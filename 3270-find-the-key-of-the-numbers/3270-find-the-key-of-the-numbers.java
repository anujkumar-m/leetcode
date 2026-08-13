class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans = 0;
        int p = 1;
        for (int i = 0; i < 4; i++) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int d3 = num3 % 10;

            int min = Math.min(d1, Math.min(d2, d3));
            ans += min * p;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            p *= 10;
        }
        return ans;
    }
}