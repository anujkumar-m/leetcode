class Solution {
    public String reverseByType(String s) {
        char []ch = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isLetter(ch[i])){
                i++;
            }
            while(i < j && !Character.isLetter(ch[j])){
                j--;
            }
            if(i < j){
                char t = ch[j];
                ch[j] = ch[i];
                ch[i] = t;
                i++;
                j--;
            }
        }
        i = 0;
        j = ch.length - 1;
        while(i < j){
            while(i < j && Character.isLetter(ch[i])){
                i++;
            }
            while(i < j && Character.isLetter(ch[j])){
                j--;
            }
            if(i < j){
                char t = ch[j];
                ch[j] = ch[i];
                ch[i] = t;
                i++;
                j--;
            }
        }
        
        return new String(ch);
    }
}