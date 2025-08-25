class Solution {
    int findminindx(int[] nums){
        int n=nums.length-1;
        int left=0,right=n;
        while(left<right){
           int mid = (left+right)/2;
            if(nums[mid]>nums[right]) left=mid+1;
            else right =mid;
        }
        return left;
    }
    int bs(int[] nums,int target,int left,int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target) return mid;
            else if(target>nums[mid]) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n=nums.length;
        int minidx=findminindx(nums);
        int ans = bs(nums,target,minidx,n-1);
        if(ans!=-1)return ans;
        return bs(nums,target,0,minidx-1);
    }
}