class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '(') st.push('(');

            else if(c ==')') st.pop();

            count = Math.max(count, st.size());
        }
        return count;
    }
}