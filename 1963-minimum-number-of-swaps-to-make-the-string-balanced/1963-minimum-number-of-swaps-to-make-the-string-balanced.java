class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0 ;i< s.length();i++){
            char c = s.charAt(i);
            if(c == '['){
                st.push('[');
            }
            else { 
                if (!st.isEmpty() && st.peek() == '[') {
                    st.pop();           // balanced pair
                } else {
                    st.push(']');       // unmatched
                }
            }
        }
        return ((st.size()/2)+1)/2;
    }
}