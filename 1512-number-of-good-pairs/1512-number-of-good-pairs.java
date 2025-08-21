class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            c+=map.getOrDefault(nums[i],0);
                map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        return c;
    }
}