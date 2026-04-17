class Solution {
    public int rev(int num) {
        int n = 0;
        while (num != 0) {
            n = n * 10 + num % 10;
            num /= 10;
        }
        return n;
    }

    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans = Math.min(ans, Math.abs(i - map.get(nums[i])));
            }
            map.put(rev(nums[i]), i);
        }

        return ans == nums.length + 1 ? -1 : ans;

    }
}