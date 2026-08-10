class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1, mis = -1;
        int[] freq = new int[nums.length + 1];
        for (int n : nums) {
            freq[n]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i] == 2)
                dup = i;
            else if (freq[i] == 0)
                mis = i;
        }
        return new int[] { dup, mis };
    }
}