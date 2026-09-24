class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int temp = sum(nums[i]);
            if(temp == i){
                return i;
            }
        }

        return -1;
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