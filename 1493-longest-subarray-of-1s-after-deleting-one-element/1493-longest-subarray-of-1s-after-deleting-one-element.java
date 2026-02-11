class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0 , r = 0;
        int maxLength = 0;
        int k=1,count = 0;
        while(r < nums.length){
            if(nums[r] == 0) {
                count++;
            }
            while(count > 1){
                if(nums[l]==0){count--;}
                l++;
            }
            maxLength = Math.max(maxLength, r - l);
            r++;
        }
        return maxLength;
    }
}