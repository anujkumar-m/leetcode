class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int n : nums){
            List<List<Integer>> subSet = new ArrayList<>();
            for(List<Integer> arr : ans){
                List<Integer> curr = new ArrayList(arr);
                curr.add(n);
                subSet.add(curr);
            }

            for(List<Integer> arr : subSet) ans.add(arr);
        }
        return ans;
    }
}