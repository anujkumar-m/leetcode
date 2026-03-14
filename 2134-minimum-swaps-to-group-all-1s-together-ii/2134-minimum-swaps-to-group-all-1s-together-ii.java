class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;
        for(int n : nums)
            if(n == 1) ones++;
        
        int n = nums.length;

        int curr = 0;
        for(int i = 0; i < ones ; i++) curr+=nums[i];

        int maxOnes = curr;

        for(int i = ones;i < n + ones ; i++){
            curr += nums[i % n];
            curr -= nums[(i - ones) % n];

            maxOnes = Math.max(maxOnes, curr);
        }
        return ones - maxOnes;
    }
}