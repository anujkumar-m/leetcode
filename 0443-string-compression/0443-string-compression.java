class Solution {
    public int compress(char[] chars) {
        char c = chars[0];
        int n = 1, k = 0;
        int count = 0;
        for(int i = 1; i < chars.length; i++){
            if(c == chars[i]){
                n += 1;
            }
            else{
                chars[k++] = c;
                if(n > 1){
                    char[] str = String.valueOf(n).toCharArray();
                    for(char ch : str)
                        chars[k++] = ch;
                }
                c = chars[i];
                n = 1;
                
            }
        }

        chars[k++] = c;
        if (n > 1) {
            char[] str = String.valueOf(n).toCharArray();
            for (char ch : str) {
                chars[k++] = ch;
            }
        }

        return k;
    }
}