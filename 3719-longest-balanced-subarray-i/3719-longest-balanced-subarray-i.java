class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            int[] freq = new int[100001];
            int evenCount = 0;
            int oddCount = 0;
            for(int j = i; j < nums.length; j++){
                if(freq[nums[j]]==0){
                    if(nums[j] % 2 == 0) evenCount++;
                    else oddCount++;
                }
                if(evenCount == oddCount) maxLen = Math.max(maxLen, j - i + 1);
                freq[nums[j]]++;
            }
        }
        return maxLen;
    }
}