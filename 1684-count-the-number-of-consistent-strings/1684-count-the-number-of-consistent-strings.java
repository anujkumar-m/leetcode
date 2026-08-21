class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean freq[] = new boolean[26];
        for(char c : allowed.toCharArray()){
            freq[c - 'a'] = true;
        }
        for (String s : words) {
            if (isConsistent(freq, s))
                count++;
        }
        return count;
    }

    boolean isConsistent(boolean[] freq, String s) {
        for (char c : s.toCharArray()) {
            if (!freq[c - 'a'])
                return false;
        }
        return true;
    }
}