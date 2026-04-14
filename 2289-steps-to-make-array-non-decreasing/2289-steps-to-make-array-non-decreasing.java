class Solution {
    public int totalSteps(int[] nums) {
        int ans = 0;
        Stack<int[]> stack = new Stack<>();
        for(int i = nums.length - 1; i>=0; i--){
            int count = 0;

            while(!stack.isEmpty() && stack.peek()[0] < nums[i]){
                count = Math.max(stack.pop()[1] , count+1);
            }
            ans = Math.max(ans, count);
            stack.push(new int[]{nums[i],count});
        }
        return ans;
    }
}