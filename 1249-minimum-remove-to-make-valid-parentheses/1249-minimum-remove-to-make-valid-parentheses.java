class Solution {
    public String minRemoveToMakeValid(String s) {
       Stack<Character> st = new Stack<>();
        int open = 0;
       for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') {
                st.push(c);
                open++;
            }
            else if(c != ')'){
                st.push(c);
            }
            else{
                if(open > 0) { 
                    st.push(c);
                    open--;
                }
            }
       } 
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            char c = st.pop();

            if (c == '(' && open > 0) {
                open--;     
                continue;
            }

            sb.append(c);
        }
        return sb.reverse().toString();
    }
}