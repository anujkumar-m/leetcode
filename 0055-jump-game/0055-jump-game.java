class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (len <= nums[i] + i)
                len = i;
        }
        return len == 0;
    }
}