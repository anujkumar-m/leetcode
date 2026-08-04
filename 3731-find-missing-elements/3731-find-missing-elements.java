class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            list.add(n);
        }
        for (int i = min; i <= max; i++) {
            if (list.contains(i))
                list.remove(Integer.valueOf(i));
            else
                list.add(i);
        }
        return list;
    }
}