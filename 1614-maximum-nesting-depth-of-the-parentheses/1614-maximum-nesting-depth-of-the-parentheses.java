class Solution {
    public int maxDepth(String s) {
        //Stack<Character> st = new Stack<>();
        int count = 0, n = 0;
        for(char c : s.toCharArray()){
            if(c == '(') n++;

            else if(c ==')') n--;

            count = Math.max(count, n);
        }
        return count;
    }
}