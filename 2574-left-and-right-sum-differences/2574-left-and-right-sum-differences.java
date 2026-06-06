class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0, rs = 0;
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for(int i = 0; i < n; i++){
            leftSum[i] = ls;
            rightSum[n - i - 1] = rs;
            ls += nums[i];
            rs += nums[n - 1 -i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;

    }
}