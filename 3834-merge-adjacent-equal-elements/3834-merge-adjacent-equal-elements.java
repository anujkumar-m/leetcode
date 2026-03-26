class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();

        for(int n : nums){

            long curr = n;
            while(!st.isEmpty() && st.peek() == curr){
                curr = st.pop() + curr;
            }

            st.push(curr);
        }
        return new ArrayList<>(st);
           
    }
}