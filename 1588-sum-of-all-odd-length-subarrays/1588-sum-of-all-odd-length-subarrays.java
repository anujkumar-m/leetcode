class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            int tot = (i + 1) * (arr.length - i);
            int count = (tot + 1) / 2;
            ans += count * arr[i];
        }
        return ans;
    }
}