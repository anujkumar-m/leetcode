class Solution {
    public int maxProduct(int[] nums) {
        int lp = -11, rp = -11;
        int curr1 = 1, curr2 = 1;
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            curr1 *= nums[i];
            curr2 *= nums[n - i];

            if (curr1 > lp)
                lp = curr1;
            if (curr1 == 0)
                curr1 = 1;

            if (curr2 > rp)
                rp = curr2;
            if (curr2 == 0)
                curr2 = 1;
        }
        return Math.max(lp, rp);
    }
}