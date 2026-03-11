class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int i = 0, j = nums.length - 1;
        int len = 0;
        while (i < nums.length && nums[i] == arr[i]) {
            i++;
        }
        while (j >= 0 && nums[j] == arr[j]) {
            j--;
        }
        if (j <= i)
            return 0;
        return j - i + 1;
    }
}