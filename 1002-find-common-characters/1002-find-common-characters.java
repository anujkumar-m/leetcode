class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);
        for (String w : words) {
            int[] count = new int[26];
            for(char c : w.toCharArray()){
                count[c - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                freq[i] = Math.min(count[i], freq[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            while(freq[i] > 0){
                result.add(String.valueOf((char) (i + 97)));
                freq[i]--;
            }
        }
        return result;
    }
}