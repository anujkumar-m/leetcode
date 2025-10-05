class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> hm=new HashMap();
        int length=0;
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        boolean odd=false;
        for(int count:hm.values()){
            if(count%2==0) length+=count;
            else {length+=count-1;
            odd=true;}
        }
        if(odd) return ++length;
        return length;
    }
}