class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,sum=0;
        int tot=n*(n+1)/2;
        for(int num:nums)
            sum+=num;
        return tot-sum;
    }
}