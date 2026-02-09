class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int l = 0,r = 0;
        int sum = 0;
        while(r < nums.length){
            sum += nums[r];
            while( sum >= target){
                sum -= nums[l];
                len = Math.min(len,r-l+1);
                l++;
            }
            r++;
        }
        return len == Integer.MAX_VALUE?0:len;
    }
}