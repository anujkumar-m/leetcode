class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;

        if (n <= 4)
            return 0;

        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int left = 0, right = n - 4; left < 4; left++, right++) {
            min = Math.min(min, nums[right] - nums[left]);
        }
        return min;
    }
}