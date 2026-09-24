class Solution {
    public int smallestIndex(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int temp = sum(nums[i]);
            if(temp == i){
                ans = Math.min(ans, temp);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    int sum(int num){
        int ans = 0;
        while(num > 0){
            ans += num % 10;
            num /= 10;
        }
        return ans;
    }
}