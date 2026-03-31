class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            System.out.println(nums[mid]);
            if(nums[mid] == target) return mid;

            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}