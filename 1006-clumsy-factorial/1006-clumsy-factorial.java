class Solution {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);
        n--;
        int ind = 0;

        while(n > 0){
            if(ind % 4 == 0) st.push(st.pop() * n);

            else if (ind % 4 == 1) st.push(st.pop() / n);

            else if(ind % 4 == 2) st.push(n);

            else st.push(-n);

            ind++;
            n--;
        }
        int ans = 0;

        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}