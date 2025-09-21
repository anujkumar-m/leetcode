class Solution {
    public int[] finalPrices(int[] p) {
        Stack<Integer> st= new Stack<>();
        int n=p.length;
        for(int i=0;i<n;i++){
            st.push(p[i]);
            for(int j=i+1;j<n;j++){
                if(p[j]<=p[i]){
                    st.pop();
                    st.push(p[i]-p[j]);
                    break;
                }
            }
        }
        int[] res = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            res[i] = st.get(i);
        }
        return res;    
        }
}