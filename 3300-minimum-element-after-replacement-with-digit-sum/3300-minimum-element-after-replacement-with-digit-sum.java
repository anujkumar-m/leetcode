class Solution {
    public int minElement(int[] nums) {
        int n = nums[0];
        for(int num : nums){
            int temp = 0;
            while(num > 0){
                temp += num % 10;
                num /= 10;
            }
            n = Math.min(temp, n);
        }
        return n;
    }
}