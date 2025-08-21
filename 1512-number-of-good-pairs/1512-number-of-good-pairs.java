class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val=nums[i];
            if (map.containsKey(val)) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> pair:map.entrySet()){
            int n=pair.getValue();
            c+=n*(n-1)/2;
        }
        return c;
    }
}