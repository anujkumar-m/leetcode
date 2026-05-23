class Solution {
    public boolean check(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean match = true;
            for (int j = 0; j < n; j++) {
                if (nums[(i + j) % n] != sorted[j]) {
                    match = false;
                    break;
                }
            }
            if (match)
                return true;
        }
        return false;
    }
}