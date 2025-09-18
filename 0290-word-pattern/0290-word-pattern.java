class Solution {
    public boolean wordPattern(String p, String s) {
        Map <Character,String> hm=new HashMap();
        String[] st=s.split(" ");
        int n=p.length();
        int m=st.length;
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            char c=p.charAt(i);
            String word=st[i];
        if(hm.containsKey(c)){
            if(!hm.get(c).equals(word)) return false;
        }
        else if(hm.containsValue(word)) return false;

        hm.put(c,word);
        }
        return true;
    }
}