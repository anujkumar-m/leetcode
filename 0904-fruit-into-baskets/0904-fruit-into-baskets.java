class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int[] freq = new int[n + 1];

        int l = 0, r = 0;
        int len = 0;
        int distinct = 0;

        while (r < n) {
            if (freq[fruits[r]] == 0) distinct++;
            freq[fruits[r]]++;
            while (distinct > 2) {
                freq[fruits[l]]--;
                if (freq[fruits[l]] == 0) distinct--;
                l++;
            }

            len = Math.max(len, r - l + 1);
            r++;
        }
        return len;
    }
}
