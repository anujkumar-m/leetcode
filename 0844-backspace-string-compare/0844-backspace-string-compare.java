class Solution {
    public boolean backspaceCompare(String s, String t) {
         Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        int n1=s.length();
        int n2=t.length();
        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(!st1.isEmpty()) 
            st1.pop();
            }
            else st1.push(ch);
        }

        for(int i=0;i<n2;i++){
            char ch=t.charAt(i);
            if(ch=='#'){
                if(!st2.isEmpty()) 
            st2.pop();
            }
            else st2.push(ch);
        }
    return (st1.equals(st2));
    }
}