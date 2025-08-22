class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> s=new ArrayDeque();
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);
        for(int i=0;i<2*nums.length;i++){
            while(!s.isEmpty() && nums[s.peek()]<nums[i%nums.length])
                res[s.pop()]=nums[i%nums.length];
        s.push(i%nums.length);
        }
        return res;
    }
}