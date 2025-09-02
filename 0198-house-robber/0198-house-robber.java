class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int []dp=new int[n];
        int prev=nums[0];
        int curr=Math.max(nums[1],nums[0]);
        int next=0;
        for(int i=2;i<n;i++){
            next=Math.max(prev+nums[i],curr);
            prev=curr;
            curr=next;
        }
        return curr;
    }
}