class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                currSum += arr[j];
                ans += (j - i + 1) % 2 == 1 ? currSum : 0;
            }
        }
        return ans;
    }
}