class Solution {
    public int missingMultiple(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            if (n % k == 0) {
                set.add(n);
            }
        }
        
        if (set.isEmpty())
            return k;
        if (set.first() != k)
            return k;

        int first = set.first();
        for (int i = 0; i < set.size(); i++) {
            if (!set.contains(first * (i + 1)))
                return first * (i + 1);
        }
        return first * (set.size() + 1);
    }
}