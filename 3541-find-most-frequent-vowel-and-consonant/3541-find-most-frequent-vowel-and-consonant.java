class Solution {
    public int maxFreqSum(String s) {
        int con=0,vow=0;
        Map<Character,Integer> hm=new HashMap<>();
        char[] ch=s.toCharArray();
        for(char c:ch){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:ch){
            if(isvowel(c))
            vow=Math.max(vow,hm.get(c));
            else
            con=Math.max(con,hm.get(c));
        }
        return con+vow;
    }
    public boolean isvowel(char c){
        return(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u');
    }
}