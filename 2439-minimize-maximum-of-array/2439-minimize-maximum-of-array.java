class Solution {
    public int minimizeArrayValue(int[] nums) {
        long ans = 0;
        long prefSum = 0;
        for(int i = 0;i<nums.length;i++){
            prefSum+=nums[i];
            ans = Math.max(ans,(prefSum+i)/(i+1));
        }
        return (int)ans;
    }
}