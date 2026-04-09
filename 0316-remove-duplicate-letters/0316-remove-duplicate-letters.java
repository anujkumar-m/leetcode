class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];

        for(int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] vis = new boolean[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(vis[c - 'a']) continue;

            while(!stack.isEmpty() && c < stack.peek() && i < lastIndex[stack.peek() -'a']){
                vis[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            vis[c - 'a'] = true;

        }
        StringBuilder str = new StringBuilder();

        for(char c : stack){
            str.append(c);
        }
        return str.toString();
    }
}