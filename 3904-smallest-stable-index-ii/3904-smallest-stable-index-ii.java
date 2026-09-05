class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int n = nums.length - 1;
        int currMin = nums[n];
        int currMax = nums[0];

        for (int i = 0; i <= n; i++) {
            currMax = Math.max(currMax, nums[i]);
            currMin = Math.min(currMin, nums[n - i]);

            max[i] = Math.max(currMax, nums[i]);
            min[n - i] = Math.min(currMin, nums[n - i]);
        }

        // System.out.println(Arrays.toString(max));
        // System.out.println(Arrays.toString(min));
        for (int i = 0; i <= n; i++) {
            if(max[i] - min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}