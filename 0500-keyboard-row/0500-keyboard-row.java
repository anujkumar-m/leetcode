class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        List<String> ans = new ArrayList<>();
        for(String s : words){
            if(isContain(s, first) || isContain(s, second) || isContain(s, third)){
                ans.add(s);
            }
        }
        return ans.toArray(new String[0]);
    }
    boolean isContain(String s, String row){
        for(char c : s.toCharArray()){
            if(!row.contains(String.valueOf(Character.toLowerCase(c))))
                return false;
        }
        return true;
    }
}