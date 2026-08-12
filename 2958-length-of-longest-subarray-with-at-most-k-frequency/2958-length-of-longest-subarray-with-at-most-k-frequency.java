class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0, start = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int end = 0; end < nums.length; end++) {
            freq.put(nums[end], freq.getOrDefault(nums[end], 0) + 1);
            while (freq.get(nums[end]) > k) {
                freq.put(nums[start], freq.getOrDefault(nums[start], 0) - 1);
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}