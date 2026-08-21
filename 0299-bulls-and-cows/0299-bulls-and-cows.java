class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] freq = new int[10];
        for(int i = 0; i < secret.length(); i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g) bull++;
            else{
                if(freq[s] < 0) cow++;
                if(freq[g] > 0) cow++;
                freq[s]++;
                freq[g]--;
            }
        }
        return bull + "A" + cow + "B";
    }
}